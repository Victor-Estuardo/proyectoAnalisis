public class FlyNoWay implements iFly {

    public FlyNoWay() {
    }


    @Override
    public void fly() {
        System.out.println("No puedo volar....");

    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }



}
