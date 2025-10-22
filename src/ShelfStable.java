public class ShelfStable extends FoodItem {
    private double shlefSatableTax;


    public ShelfStable(String name, double price, String department, int stockQuantity, String sku, String Color, double shlefSatableTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.shlefSatableTax = shlefSatableTax;

    }

    //getter
    public double getShlefSatableTax(){return shlefSatableTax;} ;

    //setter
    public void setShlefSatableTax(double fruitPrice){this.shlefSatableTax = fruitPrice;}

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.shlefSatableTax);
    }

    @Override
    public String toString(){
        return String.format("%s$%-15.2f|", super.toString(), itemPrice());
    }

}

