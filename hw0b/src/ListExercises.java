import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        int sum = 0;
        for(int i:L){
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        List<Integer> L2 = new ArrayList<>();
        for (int i:L){
            if(i % 2 == 0){
                L2.add(i);
            }
        }
        return L2;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        List<Integer> L3 = new ArrayList<>();
        for (int i:L1){
            for (int j : L2){
                if(i == j && !L3.contains(i)){
                    L3.add(i);
                }
            }
        }
        return L3;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        int count = 0;
        for (String x: words){
            for(int i=0;i < x.length();i++){
                if (x.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }
}
