public class magicalList {
    public int first;
    public magicalList rest;



    public static void main(String[] args){
        magicalList L = new magicalList();
        L.first = 15;
        L.rest = null;
        L.rest.first = 10;
        L.rest.rest = null;
        L.rest.first = 5;
        L.rest.rest =null;
    }
}
