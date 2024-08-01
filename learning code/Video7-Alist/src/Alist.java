public class Alist<Item> {
    int size;
    Item [] items;

    public void Alist(){
        size = 0;
        items = (Item[]) new Object [100];
    }

    public void AddLast(Item x){
        items[size] = x;
        size += 1;
    }

    public Item GetLast(){
        if (size == items.length) {
            Resizing(size*2);
        }
        return items[size-1];
    }

    public Item Get(int i){
        return items[i];
    }

    public int size(){
        return size;
    }

    public Item RemoveLast(){
        Item x = GetLast();
        size -= 1;
        items[size] = null; //可以，但没必要（数字没必要，图片有必要，主要看数组内容的占空间大小？）
        return x;
    }

    public void Resizing(int capacity){
        Item [] a =(Item[]) new Object[capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;
    }
}
