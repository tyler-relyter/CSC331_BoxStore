/**
 * @author Tyler Bullard
 * TV class representing a television item in the electronics department.
 * Inherits from ElectronicsItem.
 */

public class TV extends ElectronicsItem {
    private String screenType; // e.g., LED, OLED, QLED
    private double screenSize; // in inches
    private boolean isSmartTV;
    private double tvTax;

    // Constructor

    /**
     * Constructs a TV.
     * @param name String Name of the TV
     * @param price double Price of the TV
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param model String Model
     * @param warrantyPeriod int Warranty period in months
     * @param screenType String Screen type (e.g., LED, OLED, QLED)
     * @param screenSize double Screen size in inches
     * @param isSmartTV boolean Indicates if the TV is a Smart TV
     */
    public TV(String name, double price, String department, int stockQuantity, String sku,
              String brand, String model, int warrantyPeriod,
              String screenType, double screenSize, boolean isSmartTV, double tvTax) {
        super(name, price, department, stockQuantity, sku, brand, model, warrantyPeriod);
        this.screenType = screenType;
        this.screenSize = screenSize;
        this.isSmartTV = isSmartTV;
        this.tvTax = tvTax;
    }

    // no-argument constructor
    public TV() {
        super();
        this.screenType = "";
        this.screenSize = 0.0;
        this.isSmartTV = false;
        super.setDepartment("Electronics");
    }

    // Getters

    public double getTvTax() {return tvTax;}
    /**
     * Get the screen type of the TV.
     * @return screenType String representing the screen type of the TV.
     */
    public String getScreenType() { return screenType; }

    /**
     * Get the screen size of the TV.
     * @return screenSize double representing the screen size of the TV in inches.
     */
    public double getScreenSize() { return screenSize; }

    /**
     * Get whether the TV is a Smart TV.
     * @return isSmartTV boolean representing if the TV is a Smart TV.
     */
    public boolean isSmartTV() { return isSmartTV; }

    // Setters

    public void setTvTax(double tvTax) { this.tvTax = tvTax; }

    /**
     * Set the screen type of the TV.
     * @param screenType String representing the new screen type of the TV.
     */
    public void setScreenType(String screenType) { this.screenType = screenType; }

    /**
     * Set the screen size of the TV.
     * @param screenSize double representing the new screen size of the TV in inches.
     */
    public void setScreenSize(double screenSize) { this.screenSize = screenSize; }

    /**
     * Set whether the TV is a Smart TV.
     * @param smartTV boolean representing if the TV is a Smart TV.
     */
    public void setSmartTV(boolean smartTV) { this.isSmartTV = smartTV; }

    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.tvTax);
    }

    @Override
    public String toString() {
        return String.format(super.toString() + ", Screen Type: %s, Screen Size: %.1f inches, Smart TV: %b",
                             this.screenType, this.screenSize, this.isSmartTV);
    }
}