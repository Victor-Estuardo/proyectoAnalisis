import lombok.Getter;

public class MenuItem {
    @Getter
    private String name;
    @Getter
    private String description;
    private boolean vegetarian;
    @Getter
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        setName(name);
        setDescription(description);
        setVegetarian(vegetarian);
        setPrice(price);
    }

    private String cleanStr(String str){
        return str.replaceAll("\\s+", " ").trim();
    }

    private void setName(String name){
        this.name = cleanStr(name);
    }

    private void setDescription(String description){
        this.description = cleanStr(description);
    }

    private void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }

    private void setPrice(double price){
        this.price = Math.abs(price);
    }
    public MenuItem(){
        this("","",false,0.0);
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}
