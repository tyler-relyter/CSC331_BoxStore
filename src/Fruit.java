public class Fruit extends FoodItem{

    private double fruitTax;


    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, double fruitTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.fruitTax = fruitTax;

    }

    //getter
    public double getfruitPrice(){return fruitTax;} ;

    //setter
    public void setfruitPrice(double fruitPrice){this.fruitTax =fruitPrice;}

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.fruitTax);
    }

    @Override
    public String toString(){
        return String.format("%sPrice: $%.2f", super.toString(), itemPrice());
    }

}
