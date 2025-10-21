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

    //setter
    public void setVegPrice(double vegPrice) {this.vegPrice = vegPrice;}

    //getters
    public double getVegPrice() {return vegPrice;}

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.vegPrice);
    }

    // Override toString method to include vegetable-specific details
    @Override
    public String toString(){
        return String.format("%s %fPrice After Tax:", super.toString(), itemPrice());
    }
}
