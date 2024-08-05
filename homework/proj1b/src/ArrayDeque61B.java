import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T> {

    private int size;
    private T[] arraydeque;
    private int nextfirst;
    private int nextlast;


    public ArrayDeque61B() {
        size = 0;
        arraydeque = (T[]) new Object [8];
        nextfirst = 3;
        nextlast = 4;
    }


    //数组第一个元素的位置
    public int firstIndex(){
        return adjust(nextfirst+1);
    }

    //数组最后一个元素的位置
    public int lastIndex(){
        return adjust(nextlast-1);
    }

    //根据原数组生成正常顺序数组
    public T[] order(){
        T[] arraydequecopy = (T[]) new Object [size];
        for(int i = 0; i < size; i++){
            arraydequecopy[i] = arraydeque[adjust(nextfirst+1+i)];
        }
        return arraydequecopy;
    }

    //防止数组中数字越界
    public int adjust(int x){
        int result = Math.floorMod(x, arraydeque.length);
        return result;
    }

    //复制数组
    public void copyArray(T[] originalArray,T[] targetArray){
        for (int i = 0; i < originalArray.length;i++){
            targetArray[i] = originalArray[i];
        }
    }

    //增加数组大小
    public void resizingUp(int capacity){
        T[] newarray = (T[]) new Object[capacity];
        copyArray(order(),newarray);
        arraydeque =newarray;
        newarray = null;
        nextlast = size;
        nextfirst = capacity - 1;
        return;
    }

    //减小数组大小
    public void resizingDown(int capacity){
        T[] newarray = (T[]) new Object[capacity];
        copyArray(order(),newarray);
        arraydeque =newarray;
        newarray = null;
        nextlast = size;
        nextfirst = capacity - 1;
        return;
    }




    @Override
    public void addFirst(T x) {
        if (size == arraydeque.length){
            resizingUp(size*2);
        }
        arraydeque[nextfirst] = x;
        nextfirst -= 1;
        nextfirst = adjust(nextfirst);
        //取余是处理循环结构index很好的解决方案
        size += 1;
    }




    @Override
    public void addLast(T x) {
        if (size == arraydeque.length){
            resizingUp(size*2);
        }
        arraydeque[nextlast] = x;
        nextlast += 1;
        nextlast = adjust(nextlast);
        size += 1;
    }

    @Override
    public List<T> toList() {
        T[] arraydequecopy = order();
        return List.of(arraydequecopy);
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        T copy = arraydeque[firstIndex()];
        arraydeque[firstIndex()]=null;
        nextfirst += 1;
        nextfirst = adjust(nextfirst);
        size -= 1;
        if(size<arraydeque.length/4) {
            resizingDown(arraydeque.length/2);
        }
        return copy;
    }

    @Override
    public T removeLast() {
        T copy = arraydeque[lastIndex()];
        arraydeque[lastIndex()]=null;
        nextlast -= 1;
        nextlast = adjust(nextlast);
        size -= 1;
        while(size<arraydeque.length/4) {
            resizingDown(arraydeque.length/2);
        }
        return copy;
    }


    @Override
    public T get(int index) {
        return order()[index];
    }


    @Override
    public T getRecursive(int index) {
        throw new UnsupportedOperationException("No need to implement getRecursive for proj 1b");
    }
}
