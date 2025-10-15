public class Fruit extends FoodItem{

    private String fruitSource; // country of origin


    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, String Texture, String Taste, String fruitSource) {
        super(name, price, department, stockQuantity, sku, Color, Texture, Taste);
        this.fruitSource = fruitSource;

    }

    //getter
    public String getFruitSource(){return fruitSource;}

    //setter
    public void setFruitSource(String fruitSource){this.fruitSource = fruitSource;}



    @Override
    public String toString(){
        return String.format("%sSource Country: %s", super.toString(), getFruitSource());
    }



}
