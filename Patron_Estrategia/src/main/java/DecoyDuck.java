public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super.flyBehavior = new FlyNoWay();
        super.soundBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("soy un pato señuelo");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
