public class Strings {
    public static void main(String[] args){
        String s = "hello";
        s += "world";
        s += 5;
        int slength = s.length();
        String substr = s.substring(1,5);
        char c = s.charAt(2);
        System.out.println(substr);
        if(s.indexOf("hello") != -1){
            System.out.println("\"hello\" in s");
        }
        for(int i = 0; i < slength; i++){
            char letter = s.charAt(i);
            System.out.println(letter);
        }
    }
}
