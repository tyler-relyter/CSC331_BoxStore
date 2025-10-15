public class OuterWear extends ClothingItem {

    private double outerWearTax;

    public OuterWear(String name, double price, String department, int stockQuantity, String sku, String Color, double outerWearPrice ) {
        super(name, price, department, stockQuantity, sku, Color);
        this.outerWearTax = outerWearPrice;
    }

    //getter
    public double getOuterWearTax() {return this.outerWearTax;}

    //setters
    public void setOuterWearTax(double outerWearTax) {this.outerWearTax = outerWearTax;}


    @Override
    public double itemPrice(){ return super.getPrice()*(1+ outerWearTax); }

    @Override
    public String toString(){
        return String.format("%s%nAmount: %s %n", super.toString(), getStockQuantity());
    }
}
