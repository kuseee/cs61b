import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T> {

    private int size;
    private T[] arraydeque;
    private int nextfirst;
    private int nextlast;


    public ArrayDeque61B() {
        size = 0;
        arraydeque = (T[]) new Object [10];
        nextfirst = 3;
        nextlast = 4;
    }

    @Override
    public void addFirst(T x) {
        arraydeque[nextfirst] = x;
    }

    @Override
    public void addLast(T x) {
        arraydeque[nextlast] = x;
    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T removeFirst() {
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
