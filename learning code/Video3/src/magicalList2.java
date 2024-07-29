public class magicalList2 {
    public int first;
    public magicalList2 rest;
    public magicalList2 (int f,magicalList2 L){
        first = f;
        rest = L;
    }

    public int size() {
        if (rest == null){
            return 1;
        }
        return this.rest.size()+1;
    }

    public int iterativesize(){
        magicalList2 p = this;
        int totalsize = 0;
        while (p != null){
            totalsize += 1;
            p = p.rest;
        }
        return totalsize;
    }

    public int get(int i){
        if (i == 0){
            return first;
        }
    return rest.get(i-1);
    }



    public static void main(String[] args){
        magicalList2 L= new magicalList2(15,null);
        L = new magicalList2(10, L);
        L = new magicalList2(5, L);
        System.out.println(L.get(1));
    }
}
