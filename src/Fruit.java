public class Fruit extends FoodItem{

    private double fruitPrice;


    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, String Texture, String Taste, double foodPrice, double fruitPrice) {
        super(name, price, department, stockQuantity, sku, Color, Texture, Taste, foodPrice);
        this.fruitPrice = fruitPrice;

    }

    //getter
    public double getfruitPrice(){return fruitPrice;} ;

    //setter
    public void setfruitPrice(double fruitPrice){this.fruitPrice =fruitPrice;}

    @Override
    public double itemPrice(){
        return getfruitPrice() + super.itemPrice();
    }

    @Override
    public String toString(){
        return String.format("%sPrice: $%.2f", super.toString(), itemPrice());
    }



}
