public class CleaningSupply extends HouseHoldItem {

    private String scent;
    private double cleaningTax;

    // Full constructor
    public CleaningSupply(String name, double price, String department, int stockQuantity, String sku, String material, String scent, double cleaningTax) {
        super(name, price, department, stockQuantity, sku, material);
        this.scent = scent;
        this.cleaningTax = cleaningTax;
    }

    // getter/setter
    public String getScent() { return scent; }
    public void setScent(String scent) { this.scent = scent; }
    public double getCleaningTax() { return cleaningTax; }

    // Setter

    /**
     *
     * @param cleaningTax double
     */
    public void  setCleaningTax(double cleaningTax) {this.cleaningTax = cleaningTax; }
    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.getCleaningTax());
    }

    @Override
    public String toString(){
        return String.format("%s|%-15s|$%-15.2f|", super.toString(),getScent(), itemPrice());
    }
}
