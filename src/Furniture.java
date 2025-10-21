public class Furniture extends HouseHoldItem {

    private String type;   // e.g., "Chair", "Table", "Sofa"

    // Full constructor
    public Furniture(String name, double price, String department, int stockQuantity, String sku, String material, String type) {
        super(name, price, department, stockQuantity, sku, material);
        super.setDepartment("Household - Furniture");
        this.type = type;
    }

    // Minimal constructor
    public Furniture(String name, double price, String department, int stockQuantity, String sku, String material) {
        super(name, price, department, stockQuantity, sku, material);
        super.setDepartment("Household - Furniture");
        this.type = "";
    }

    // getter/setter
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public double itemPrice() { return super.getPrice(); }

    @Override
    public String toString() {
        return String.format("%sType: %s%n", super.toString(), type);
    }
}
