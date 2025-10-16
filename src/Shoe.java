public class Shoe extends ClothingItem {

    private double shoeTax;

    public Shoe(String name, double price, String department, int stockQuantity, String sku, String Color, double shoeTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.shoeTax = shoeTax;

    }

    //getters
    public double getShoeTax(){return this.shoeTax;}

    //setter
    public void setShoeTax(double shoeTax){this.shoeTax = shoeTax;}

    @Override
    public double itemPrice(){ return super.getPrice()*(1 + this.shoeTax); }

    @Override
    public String toString(){
        return String.format("%s%nAmount: %n Price After Tax: %s", super.toString(), getShoeTax());
    }
}

