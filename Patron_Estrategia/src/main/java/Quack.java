public class Quack implements iSound{
    public Quack() {
    }

    @Override
    public void makeSound(){
        System.out.println("quack quack...");
    }
    @Override
    public String toString() {
        return "Quack{}";
    }
}
