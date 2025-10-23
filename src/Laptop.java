/**
 * @author Tyler Bullard
 * @author Luis Carmona
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * Description:
 * Laptop class representing a laptop item in the electronics category.
 * Inherits from ElectronicsItem.
 */

public class Laptop extends ElectronicsItem {
    private String processor; // Intel i5 13600k, AMD Ryzen 5 7700X, etc.
    private int ram; // in GB
    private int storage; // in GB
    private double screenSize; // in inches

    // Constructor

    /**
     * Constructs a Laptop.
     * @param name String Name of the Laptop
     * @param price double Price of the Laptop
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param model String Model
     * @param warrantyPeriod   int Warranty period in months
     * @param processor String Processor (e.g., Intel i5 13600k, AMD Ryzen 5 7700X)
     * @param ram int RAM in GB
     * @param storage int Storage in GB
     * @param screenSize double Screen size in inches
     */
    public Laptop(String name, double price, String department, int stockQuantity, String sku,
                  String brand, String model, int warrantyPeriod,
                  String processor, int ram, int storage, double screenSize) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    // no-argument constructor
    public Laptop() {
        super();
        this.processor = "";
        this.ram = 0;
        this.storage = 0;
        this.screenSize = 0.0;
        super.setDepartment("Electronics");
    }

    // Getters

    /**
     * Get the processor of the Laptop.
     * @return processor String representing the processor of the Laptop.
     */
    public String getProcessor() { return processor; }

    /**
     * Get the RAM of the Laptop.
     * @return ram int representing the RAM of the Laptop in GB.
     */
    public int getRam() { return ram; }

    /**
     * Get the storage of the Laptop.
     * @return storage int representing the storage of the Laptop in GB.
     */
    public int getStorage() { return storage; }

    /**
     * Get the screen size of the Laptop.
     * @return screenSize double representing the screen size of the Laptop in inches.
     */
    public double getScreenSize() { return screenSize; }

    /**
     * Get the tax rate for the Laptop.
     * @return eTAX double representing the tax rate for the Laptop.
     */
    public double getTaxRate() {
        return super.getETAX(); // tax rate for laptops
    }

    // Setters

    /**
     * Set the processor of the Laptop.
     * @param processor String representing the new processor of the Laptop.
     */
    public void setProcessor(String processor) { this.processor = processor; }

    /**
     * Set the RAM of the Laptop.
     * @param ram int representing the new RAM of the Laptop in GB.
     */
    public void setRam(int ram) { this.ram = ram; }

    /**
     * Set the storage of the Laptop.
     * @param storage int representing the new storage of the Laptop in GB.
     */
    public void setStorage(int storage) { this.storage = storage; }

    /**
     * Set the screen size of the Laptop.
     * @param screenSize double representing the new screen size of the Laptop in inches.
     */
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + super.getETAX());
    }

    @Override
    public String toString() {
        return String.format("%s%nProcessor: %s%nRAM: %d GB%nStorage: %d GB%nScreen Size: %.1f inches%n",
                super.toString(), this.processor, this.ram, this.storage, this.screenSize);
    }
}
