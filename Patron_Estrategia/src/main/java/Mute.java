public class Mute implements iSound{
    public Mute() {
    }

    @Override
    public void makeSound(){
        System.out.println("no puedo graznar...");
    }
    @Override
    public String toString() {
        return "Mute{}";
    }
}
