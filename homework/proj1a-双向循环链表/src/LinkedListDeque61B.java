import java.util.ArrayList;
import java.util.List;

public class LinkedListDeque61B<T> implements Deque61B<T>{



    public class ItemNode{
        T item;
        ItemNode prev;
        ItemNode next;
        public ItemNode(T I,ItemNode p,ItemNode n){
            item = I;
            prev = p;
            next = n;
        }
    }

    private ItemNode sentinel;
    private int size;



    public LinkedListDeque61B() {
        int size = 0;
    }

    @Override
    public void addFirst(T x) {
        if (size == 0){
            sentinel = new ItemNode(x,null,null);
            ItemNode newNode = new ItemNode(x, sentinel, sentinel);
            sentinel.next=newNode;
            sentinel.prev=newNode;
            size++;
            return;
        }
        ItemNode newNode = new ItemNode(x, sentinel, sentinel.next);
        sentinel.next.prev = newNode;
        sentinel.next = newNode;
        size++;
    }

    @Override
    public void addLast(T x) {
        if (size == 0){
            sentinel = new ItemNode(x,null,null);
            ItemNode newNode = new ItemNode(x, sentinel, sentinel);
            sentinel.next=newNode;
            sentinel.prev=newNode;
            size++;
            return;
        }
        ItemNode newNode = new ItemNode(x, sentinel.prev, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size ++;
    }

    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>(size); // 创建一个新的ArrayList以保存链表元素
        ItemNode current = sentinel.next;    // 从头部哨兵的下一个节点开始
        while (current != sentinel) {        // 遍历直到到达尾部哨兵
            list.add(current.item);           // 将当前节点的item添加到列表中
            current = current.next;           // 移动到下一个节点
        }
        return List.copyOf(list);             // 返回包含所有链表元素的不可变列表
    }


    @Override
    public boolean isEmpty() {
        if (size == 0){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        sentinel.next=sentinel.next.next;
        sentinel.next.prev=sentinel;
        return null;
    }

    @Override
    public T removeLast() {
        sentinel.prev=sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        return null;
    }

    @Override
    public T get(int index) {
        ItemNode copy = sentinel.next;
        if (index > size || index < 0) {
            return null;
        }
        while (index != 0) {
            copy = copy.next;
            index -= 1;
        }
        return copy.item;
    }

    @Override
    public T getRecursive(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return getRecursiveHelper(sentinel.next, index);
    }

    // 辅助递归方法
    private T getRecursiveHelper(ItemNode node, int index) {
        if (index == 0) {
            return node.item;
        }
        return getRecursiveHelper(node.next, index - 1);
    }
}
