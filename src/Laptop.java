public class Laptop extends ElectronicsItem {
    private String processor; // Intel i5 13600k, AMD Ryzen 5 7700X, etc.
    private int ram; // in GB
    private int storage; // in GB
    private double screenSize; // in inches

    // Constructor
    public Laptop(String name, double price, String department, int stockQuantity, String sku,
                  String brand, String model, int warrantyPeriod,
                  String processor, int ram, int storage, double screenSize) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    // Getters
    public String getProcessor() { return processor; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public double getScreenSize() { return screenSize; }

    // Setters
    public void setProcessor(String processor) { this.processor = processor; }
    public void setRam(int ram) { this.ram = ram; }
    public void setStorage(int storage) { this.storage = storage; }
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    @Override
    public String toString() {
        return super.toString() + ", Processor: " + processor + ", RAM: " + ram + "GB" +
               ", Storage: " + storage + "GB" + ", Screen Size: " + screenSize + " inches";
    }
}
