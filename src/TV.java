public class TV extends ElectronicsItem {
    private String screenType; // e.g., LED, OLED, QLED
    private double screenSize; // in inches
    private boolean isSmartTV;

    // Constructor
    public TV(String name, double price, String department, int stockQuantity, String sku,
              String brand, String model, int warrantyPeriod,
              String screenType, double screenSize, boolean isSmartTV) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.screenType = screenType;
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
    }

    // Getters
    public String getScreenType() { return screenType; }
    public double getScreenSize() { return screenSize; }
    public boolean isSmartTV() { return isSmartTV; }

    // Setters
    public void setScreenType(String screenType) { this.screenType = screenType; }
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }
    public void setSmartTV(boolean smartTV) { this.isSmartTV = smartTV; }

    @Override
    public String toString() {
        return super.toString() + ", Screen Type: " + screenType + ", Screen Size: " + screenSize + " inches" +
               ", Smart TV: " + isSmartTV ;
    }
}
