public class ShelfStable extends FoodItem {
    private double shelfStableTax;


    public ShelfStable(String name, double price, String department, int stockQuantity, String sku, String Color, double shelfStableTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.shelfStableTax = shelfStableTax;

    }

    //getter
    public double getshelfStableTax(){return shelfStableTax;} ;

    //setter
    public void setshelfStableTax(double fruitPrice){this.shelfStableTax = fruitPrice;}

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.shelfStableTax);
    }

    @Override
    public String toString(){
        return String.format("%s$%-15.2f|", super.toString(), itemPrice());
    }

}

