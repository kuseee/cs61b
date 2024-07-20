public class printIndexed {
    public static void printindexed(String para){
        int Plength = para.length();
        int i;
        StringBuilder line = new StringBuilder();
        for (i=0;i<Plength;i++){
            int reversenumber = Plength - i - 1;
            line.append(para.charAt(i)+ String.valueOf(reversenumber));
        }
        System.out.println(line);
    }
    public static void main(String[] args){
        String str ="aaaaaa";
        printindexed(str);
    }
}
