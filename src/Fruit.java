public class Fruit extends FoodItem{

    private double fruitTax;


    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, String Texture, String Taste, double foodPrice, double fruitPrice) {
        super(name, price, department, stockQuantity, sku, Color, Texture, Taste, foodPrice);
        this.fruitTax = fruitPrice;

    }

    //getter
    public double getfruitPrice(){return fruitTax;} ;

    //setter
    public void setfruitPrice(double fruitPrice){this.fruitTax =fruitPrice;}

    @Override
    public double itemPrice(){
        return getfruitPrice() + super.itemPrice();
    }

    @Override
    public String toString(){
        return String.format("%sPrice: $%.2f", super.toString(), itemPrice());
    }



}
