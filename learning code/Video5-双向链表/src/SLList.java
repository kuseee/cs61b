public class SLList<Any> {
    private class AnyNode{
        Any item;
        AnyNode next;
        private AnyNode(Any i,AnyNode n){
            item = i;
            next = n;
        }
    }

    private int size;
    private AnyNode sentinel;
    private AnyNode Last;


    public SLList(){
        sentinel = new AnyNode(null,Last);
        size = 0;
    }
    public SLList(Any x){
        sentinel = new AnyNode(null,null);
        sentinel.next = new AnyNode (x,null);
        Last = sentinel.next;
        size = 1;
    }

    public void AddFirst(Any x){
        sentinel.next = new AnyNode(x,sentinel.next);
        size += 1;
    }

//    private int size(AnyNode p){
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


    public void AddLast(Any x){
        AnyNode copy = sentinel.next;
        while(copy.next != null){
            copy = copy.next;
        }
        copy.next =new AnyNode(x,null);
        size += 1;
    }

    public void QuickAddLast(Any x){
        Last.next = new AnyNode(x, null);
        Last = Last.next;
        size += 1;
    }




    public Any ReturnFirst(){
        return sentinel.next.item;
    }

    public static void main(String[] args){
        SLList<Integer> L = new SLList<>(5);
        L.AddLast(20);
        L.AddFirst(10);
        L.AddFirst(15);
        L.QuickAddLast(25);
        L.QuickAddLast(30);
        System.out.println(L.ReturnFirst());
        System.out.println(L.size());
    }
}




