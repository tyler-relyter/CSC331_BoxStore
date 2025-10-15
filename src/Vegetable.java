public class Vegetable extends FoodItem {

    private double vegPrice;

    public Vegetable(String name, double price, String department, int stockQuantity, String sku, String Color,  double vegPrice) {
        super(name, price, department, stockQuantity, sku, Color);
        if (vegPrice <= 0){
            this.vegPrice = 1.50;
        }
        else {
            this.vegPrice = vegPrice;
        }
    }

    //getters
    public double getVegPrice() {return vegPrice;}

    //setters
    public void setVegPrice(double vegPrice) {if (vegPrice <= 0){ this.vegPrice = vegPrice; }}

    //Other methods


    @Override
    public double itemPrice(){ return getVegPrice() + super.itemPrice(); }

    @Override
    public String toString(){
        return String.format("%s%n Vegetable: %.2f",super.itemPrice(), vegPrice);
    }
}
