public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first =f;
        rest = r;
    }

    public static void main(String[] args){
        IntList L = new IntList(5,null);
        L = new IntList(10,L);
        L = new IntList(15,L);
    }
}
