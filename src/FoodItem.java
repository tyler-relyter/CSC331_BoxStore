public class FoodItem extends StoreItem{

    private String Color;

    /**
     * Constructs a FoodItem with all fields specified.
     *
     * @param name          the display name of the item
     * @param price         the unit price of the item
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     * @param Color         the color description for the food item
     */
    public FoodItem(String name, double price, String department, int stockQuantity, String sku, String Color) {
        super(name, price, department, stockQuantity, sku);
        this.Color = Color;

    }

    //getter
    public String getColor(){return Color;}

    /**
     * Constructs a FoodItem without specifying color (color defaults to empty string).
     *
     * @param name          the display name of the item
     * @param price         the unit price of the item
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     */
    public FoodItem(String name, double price, String department, int stockQuantity, String sku) {
        super(name, price, department, stockQuantity, sku);
        this.Color = "";
    }

    /**
     * Returns the color description of this food item.
     *
     * @return the color as a String
     */
    public String getColor() {
        return Color;
    }

    /**
     * Updates the color description for this food item.
     *
     * @param Color the new color value to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Returns the effective item price.
     * This implementation returns the base price from the superclass.
     *
     * @return the unit price for this item
     */
    @Override
    public double itemPrice() {
        return super.getPrice();
    }

    /**
     * Returns a formatted string representation of this FoodItem suitable for tabular display.
     * The output appends the color field to the superclass string.
     *
     * @return formatted string including superclass fields and color
     */
    @Override
    public String toString() {
        return String.format("%s%-15s|", super.toString(), getColor());
    }
}
