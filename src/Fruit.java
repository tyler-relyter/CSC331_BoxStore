/**
 * Represents a fruit item in the inventory.
 * Extends FoodItem by adding a fruit-specific tax rate and overriding price calculation.
 *
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * @version 1.0
 * @since 2025-10
 * CSC 331-003
 */
public class Fruit extends FoodItem {

    private double fruitTax;

    /**
     * Constructs a Fruit with the specified attributes.
     *
     * @param name          the display name of the fruit
     * @param price         the base unit price of the fruit (before tax)
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     * @param Color         the color description for the fruit
     * @param fruitTax      the tax rate to apply to this fruit (expressed as a decimal, e.g. 0.07 for 7%)
     */
    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, double fruitTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.fruitTax = fruitTax;
    }

    /**
     * Returns the fruit-specific tax rate.
     *
     * @return the tax rate as a decimal (e.g. 0.07 for 7%)
     */
    public double getFruitTax() {
        return fruitTax;
    }

    /**
     * Updates the fruit-specific tax rate.
     *
     * @param fruitPrice the new tax rate to set (expressed as a decimal, e.g. 0.07 for 7%)
     */
    public void setFruitTax(double fruitPrice) {
        this.fruitTax = fruitPrice;
    }

    /**
     * Calculates the item price including the fruit-specific tax.
     *
     * @return the final unit price after applying the fruit tax
     */
    @Override
    public double itemPrice() {
        return super.getPrice() * (1 + this.fruitTax);
    }

    /**
     * Returns a formatted string for tabular display including the computed item price.
     *
     * @return formatted string combining superclass fields and the taxed price
     */
    @Override
    public String toString() {
        return String.format("%s$%-15.2f|", super.toString(), itemPrice());
    }

}
