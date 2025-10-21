public class Furniture extends HouseHoldItem {

    private String type;   // e.g., "Chair", "Table", "Sofa"
    private double furnitureTax;

    // Full constructor
    public Furniture(String name, double price, String department, int stockQuantity, String sku, String material, String type, double furnitureTax) {
        super(name, price, department, stockQuantity, sku, material);
        super.setDepartment("Household - Furniture");
        this.type = type;
        this.furnitureTax = furnitureTax;
    }

    // getter/setter
    public String getType() { return type; }
    public double getfurnitureTax(){return furnitureTax;}
    public void setFurnitureTax(double furnitureTax){this.furnitureTax = furnitureTax;}
    public void setType(String type) { this.type = type; }

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.furnitureTax);
    }

    @Override
    public String toString() {
        return String.format("%sType: %s%n", super.toString(), type);
    }
}
