public class loop {
    public static void main(String[] args){
        int i,j;
        for (i = 1; i <= 5; i++){
            StringBuilder line = new StringBuilder();
            for (j = 1; j <= i; j++){
                line.append('*');
            }
            System.out.println(line);
        }
    }
}
