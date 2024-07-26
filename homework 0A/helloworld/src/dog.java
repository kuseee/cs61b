public class dog {
    int weight;
    static String classname = "guojiantama";


    /* use a integer to initialize the class dog*/
    public dog(int weightgiven){
        weight = weightgiven;
    }



    /* print the voice according to dog's weight*/
    public void MakeNoise(){
        if (weight < 10){
            System.out.println("yip!");
        }
        else if(weight < 30){
            System.out.println("bark!");
        }
        else{
            System.out.println("wrooof");
        }
    }



    /*用静态方法选出较大的狗*/
    public static dog LargerDog(dog dog1,dog dog2){
        if (dog1.weight < dog2.weight)
            return dog2;
        else
            return dog1;
    }


    /* use non-static method to select the larger dog*/
    public dog LargerDog2(dog dog1){
        if (this.weight < dog1.weight)
            return dog1;
        else
            return this;
    }
}
