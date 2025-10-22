public class HouseHoldItem extends StoreItem {

    private String material;

    // Full constructor
    public HouseHoldItem(String name, double price, String department, int stockQuantity, String sku, String material) {
        super(name, price, department, stockQuantity, sku);
        this.material = material;
    }

    // Constructor without material
    public HouseHoldItem(String name, double price, String department, int stockQuantity, String sku) {
        super(name, price, department, stockQuantity, sku);
        super.setDepartment("Household");
        this.material = "";
    }

    // getter/setter
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    @Override
    public double itemPrice() { return super.getPrice(); }

    @Override
    public String toString(){
        return String.format("%s%-15s", super.toString(), getMaterial());
    }
}
