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

    public void resizingUp(int x){
        return;
    }
    public void resizingDown(int x){
        return;
    }


    @Override
    public void addFirst(T x) {
        if (size == arraydeque.length){
            resizingUp(size*2);
        }
        arraydeque[nextfirst] = x;
        nextfirst -= 1;
        nextfirst = Math.floorMod(nextfirst, arraydeque.length);
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
        nextlast = Math.floorMod(nextlast, arraydeque.length);
        size += 1;
    }

    @Override
    public List<T> toList() {
        T[] arraydequecopy = (T[]) new Object [size];
        for(int i = 0; i < size; i++){
            arraydequecopy[i] = arraydeque[Math.floorMod(nextfirst+1+i, arraydeque.length)];
        }

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
        if(size<arraydeque.length/4) {
            resizingDown();
        }
        }
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
