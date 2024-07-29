public class doglauncher {
    public static void main(String[] args){
        dog steven = new dog(100);
        steven.MakeNoise();
        dog manydogs[]= new dog[2];
        manydogs[0] = new dog(55);
        manydogs[1] = new dog(165);
        dog.LargerDog(manydogs[0],manydogs[1]).MakeNoise();
        manydogs[0].LargerDog2(manydogs[1]).MakeNoise();
    }
}
