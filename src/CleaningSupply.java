public class CleaningSupply extends HouseHoldItem {

    private String scent;

    // Full constructor
    public CleaningSupply(String name, double price, String department, int stockQuantity, String sku, String material, String scent) {
        super(name, price, department, stockQuantity, sku, material);
        super.setDepartment("Household - Cleaning");
        this.scent = scent;
    }

    // Minimal constructor
    public CleaningSupply(String name, double price, String department, int stockQuantity, String sku, String material) {
        super(name, price, department, stockQuantity, sku, material);
        super.setDepartment("Household - Cleaning");
        this.scent = "";
    }

    // getter/setter
    public String getScent() { return scent; }
    public void setScent(String scent) { this.scent = scent; }

    @Override
    public double itemPrice() { return super.getPrice(); }

    @Override
    public String toString() {
        return String.format("%sScent: %s%n", super.toString(), scent);
    }
}
