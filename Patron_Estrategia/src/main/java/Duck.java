public  abstract class Duck {
    protected iFly flyBehavior;
    protected iSound soundBehavior;
    public Duck() {

    }
    public void setFlyBehavior(iFly flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void swim(){
        System.out.println("Estoy nadando, incluso puedo flotar");

    }
    public void perfomFly(){
        flyBehavior.fly();
    }
    public void perfomSound(){
        soundBehavior.makeSound();
    }
    public abstract void display();
    @Override
    public String toString() {return "Duck{}";}
}
