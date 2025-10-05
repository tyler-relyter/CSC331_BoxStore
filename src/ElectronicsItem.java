public class ElectronicsItem extends StoreItem {
    private String brand;
    private String model;
    private int warrantyPeriod; // in months

    // Constructor
    public ElectronicsItem(String name, double price, String department, int stockQuantity, String sku,
                           String brand, String model, int warrantyPeriod) {
        super(name, price, department, stockQuantity, sku);
        this.brand = brand;
        this.model = model;
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Model: " + model + ", Warranty Period: " + warrantyPeriod + " months";
    }
}
