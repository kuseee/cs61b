public interface Dog {
    public void Bark();
    void Eat();
    void Run();
    default void gun(){
        System.out.println("swirl");
    }
}
