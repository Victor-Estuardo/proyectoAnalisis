public class Car implements Vehicle{
    @Override
    public void design() {
        System.out.println("Diseñando un automóvil");
    }

    @Override
    public void manufacture() {
        System.out.println("Fabricando un automóvil");
    }
}
