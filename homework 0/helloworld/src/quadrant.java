public class quadrant {
    public static int quadrant(double x,double y){
        if(x == 0 || y == 0){
            return 0;
        }
        else if(x > 0){
            if(y > 0){
                return 1;
            }
            else{
                return 4;
            }
        }
        else{
            if (y > 0){
                return 2;
            }
            else{
                return 3;
            }
        }
    }
}
