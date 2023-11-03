public class FlyWithWings implements iFly {

    public FlyWithWings() {
    }


    @Override
    public void fly() {
        System.out.println("Estoy volando....");
    }

    @Override
    public String toString() {
        return "FlyWithWings{}";
    }


}
