public class SLList {
    private static class IntNode{
        int item;
        IntNode next;
        private IntNode(int i,IntNode n){
            item = i;
            next = n;
        }
    }

    private int size;
    private IntNode sentinel;

    public SLList(){
        sentinel = new IntNode(42,null);
        size = 0;
    }
    public SLList(int x){
        sentinel = new IntNode(42,null);
        sentinel.next = new IntNode (x,null);
        size = 1;
    }

    public void AddFirst(int x){
        sentinel.next = new IntNode(x,sentinel.next);
        size += 1;
    }

//    private static int size(IntNode p){
//        if(p.next== null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
//
//
//    public int size(){
//        return size(first);
//    }


    public int size(){
        return size;
    }


    public void AddLast(int x){
        IntNode copy = sentinel.next;
        while(copy.next != null){
            copy = copy.next;
        }
        copy.next =new IntNode(x,null);
        size += 1;
    }

    public int ReturnFirst(){
        return sentinel.next.item;
    }

    public static void main(String[] args){
        SLList L = new SLList(5);
        L.AddLast(20);
        L.AddFirst(10);
        L.AddFirst(15);
        System.out.println(L.ReturnFirst());
        System.out.println(L.size());
    }
}




