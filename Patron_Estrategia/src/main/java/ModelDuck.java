public class ModelDuck extends Duck {
    public ModelDuck() {
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato modelo");
    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }
}

