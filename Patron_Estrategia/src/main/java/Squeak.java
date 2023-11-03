public class Squeak implements iSound{
    public Squeak() {
    }

    @Override
    public void makeSound(){
        System.out.println("squeak squeak...");
    }
    @Override
    public String toString() {
        return "Squeak{}";
    }
}
