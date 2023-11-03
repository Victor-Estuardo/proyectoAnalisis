public class MallarDuck extends Duck {

    public MallarDuck() {
        super.flyBehavior = new FlyWithWings();
        super.soundBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Hola soy pato silvestre");
    }

    @Override
    public String toString() {
        return "MallarDuck{}";
    }
}
