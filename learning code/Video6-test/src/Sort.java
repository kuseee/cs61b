public class Sort {
    public static void sort(String[] input){
        sort(input,0);
        return;
    }


//    这个递归有技巧的，因为正常没必要给个start，默认从0开始就行，但是start为递归创造了条件
    private static void sort(String[] input, int start){
        if(start == input.length - 1){
            return;
        }
        swap(input,findsmallest(input,start),start);
        sort(input,start + 1);
    }

    public static int findsmallest(String[] input,int start){
        String smallest = input[start];
        int sma = start;
        for(int i = start; i < input.length; i++){
            if(smallest.compareTo(input[i])>0){
                smallest = input[i];
                sma = i;
            }
        }
        return sma;
    }

    public static String[] swap(String[] input,int x, int y){
        String temp;
        temp = input[x];
        input[x] = input[y];
        input[y] = temp;
        return input;
    }
}
