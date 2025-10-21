/**
 * @author Tyler Bullard
 * Phone class representing a phone item in the electronics department.
 * Inherits from ElectronicsItem.
 */

public class Phone extends ElectronicsItem {
    private String operatingSystem; // iOS, Android, Windows
    private int storage; // in GB
    private double screenSize; // in inches

    // Constructor

    /**
     * Constructs a Phone.
     * @param name String Name of the Phone
     * @param price double Price of the Phone
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param model String Model
     * @param warrantyPeriod  int Warranty period in months
     * @param operatingSystem String Operating System (e.g., iOS, Android, Windows)
     * @param storage int Storage in GB
     * @param screenSize double Screen size in inches
     */
    public Phone(String name, double price, String department, int stockQuantity, String sku,
                 String brand, String model, int warrantyPeriod,
                 String operatingSystem, int storage, double screenSize) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    // no-argument constructor
    public Phone() {
        super();
        this.operatingSystem = "";
        this.storage = 0;
        this.screenSize = 0.0;
        super.setDepartment("Electronics");
    }

    // Getters

    /**
     * Get the operating system of the Phone.
     * @return operatingSystem String representing the operating system of the Phone.
     */
    public String getOperatingSystem() { return operatingSystem; }

    /**
     * Get the storage of the Phone.
     * @return storage int representing the storage of the Phone in GB.
     */
    public int getStorage() { return storage; }

    /**
     * Get the screen size of the Phone.
     * @return screenSize double representing the screen size of the Phone in inches.
     */
    public double getScreenSize() { return screenSize; }

    // Setters

    /**
     * Set the operating system of the Phone.
     * @param operatingSystem String representing the new operating system of the Phone.
     */
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }

    /**
     * Set the storage of the Phone.
     * @param storage int representing the new storage of the Phone in GB.
     */
    public void setStorage(int storage) { this.storage = storage; }

    /**
     * Set the screen size of the Phone.
     * @param screenSize double representing the new screen size of the Phone in inches.
     */
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    @Override
    public String toString() {
        return String.format("%s%nOperating System: %s%nStorage: %d GB%nScreen Size: %.2f inches",
                super.toString(), operatingSystem, storage, screenSize);
    }
}
