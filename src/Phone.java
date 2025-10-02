public class Phone extends ElectronicsItem {
    private String operatingSystem; // iOS, Android, Windows
    private int storage; // in GB
    private double screenSize; // in inches

    // Constructor
    public Phone(String name, double price, String department, int stockQuantity, String sku,
                 String brand, String model, int warrantyPeriod,
                 String operatingSystem, int storage, double screenSize) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.operatingSystem = operatingSystem;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    // Getters
    public String getOperatingSystem() { return operatingSystem; }
    public int getStorage() { return storage; }
    public double getScreenSize() { return screenSize; }

    // Setters
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    @Override
    public String toString() {
        return super.toString() + ", OS: " + operatingSystem + ", Storage: " + storage + "GB" +
               ", Screen Size: " + screenSize + " inches";
    }
}
