/**
 * @author Tyler Bullard
 * This class represents an electronics item in a retail store.
 * It extends the StoreItem class and adds electronics-specific attributes
 * such as brand, model, and warranty period.
 */

public abstract class ElectronicsItem extends StoreItem {
    private String brand;
    private String model;
    private int warrantyPeriod; // in months

    // Constructor

    /**
     * Constructs an ElectronicsItem.
     * @param name String Name of the electronics item
     * @param price double Price of the electronics item
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param model String Model
     * @param warrantyPeriod int Warranty period in months
     */
    public ElectronicsItem(String name, double price, String department, int stockQuantity, String sku,
                           String brand, String model, int warrantyPeriod) {
        super(name, price, department, stockQuantity, sku);

        this.brand = brand;
        this.model = model;
        this.warrantyPeriod = warrantyPeriod;
    }

    // No-argument constructor
    public ElectronicsItem() {
        super();
        this.brand = "";
        this.model = "";
        this.warrantyPeriod = 0;
        super.setDepartment("Electronics");
    }

    // Getters

    /**
     * Get the brand of the electronics item.
     * @return brand String representing the brand of the electronics item.
     */
    public String getBrand() { return brand; }

    /**
     * Get the model of the electronics item.
     * @return model String representing the model of the electronics item.
     */
    public String getModel() { return model; }

    /**
     * Get the warranty period of the electronics item.
     * @return warrantyPeriod int representing the warranty period in months.
     */
    public int getWarrantyPeriod() { return warrantyPeriod; }


    // Setters

    /**
     * Set the brand of the electronics item.
     * @param brand String representing the new brand of the electronics item.
     */
    public void setBrand(String brand) { this.brand = brand; }

    /**
     * Set the model of the electronics item.
     * @param model String representing the new model of the electronics item.
     */
    public void setModel(String model) { this.model = model; }

    /**
     * Set the warranty period of the electronics item.
     * @param warrantyPeriod int representing the new warranty period in months.
     */
    public void setWarrantyPeriod(int warrantyPeriod) { this.warrantyPeriod = warrantyPeriod; }

    @Override
    public double itemPrice(){return super.getPrice();}


    // Override toString method to include electronics-specific details
    @Override
    public String toString() {
        return String.format("%s\nBrand: %s\nModel: %s\nWarranty Period: %d months",
                super.toString(), brand, model, warrantyPeriod);
    }

}
