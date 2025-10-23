/**
 * Represents a vegetable item in inventory.
 * Extends FoodItem and applies a vegetable-specific price modifier.
 *
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * @version 1.0
 * @since 2025-10
 * CSC 331-003
 */
public class Vegetable extends FoodItem {

    private double vegPrice;

    /**
     * Constructs a Vegetable with the specified attributes.
     *
     * @param name          the display name of the vegetable
     * @param price         the base unit price of the vegetable (before modifier)
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     * @param Color         the color description for the vegetable
     * @param vegPrice      the vegetable-specific price modifier (used as a decimal multiplier;
     *                      if {@code vegPrice <= 0} the constructor sets it to {@code 1.50})
     */
    public Vegetable(String name, double price, String department, int stockQuantity, String sku, String Color,  double vegPrice) {
        super(name, price, department, stockQuantity, sku, Color);
        if (vegPrice <= 0){
            this.vegPrice = 1.50;
        }
        else {
            this.vegPrice = vegPrice;
        }
    }

    /**
     * Sets the vegetable-specific price modifier.
     *
     * <p>No validation is performed here; use the constructor to ensure a default value for invalid inputs.</p>
     *
     * @param vegPrice the new vegetable price modifier to set
     */
    public void setVegPrice(double vegPrice) {this.vegPrice = vegPrice;}

    /**
     * Returns the vegetable-specific price modifier.
     *
     * @return the current vegetable price modifier
     */
    public double getVegPrice() {return vegPrice;}

    /**
     * Calculates the final item price for this vegetable.
     *
     * <p>The final price is computed as {@code basePrice * (1 + vegPrice)} where {@code basePrice}
     * is obtained from the superclass {@link FoodItem#getPrice()}.</p>
     *
     * @return the computed unit price after applying the vegetable modifier
     */
    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.vegPrice);
    }

    /**
     * Returns a formatted string representation of this Vegetable suitable for tabular display.
     *
     * @return formatted {@link String} including superclass fields and the computed item price
     */
    @Override
    public String toString(){
        return String.format("%s$%-15.2f|", super.toString(), itemPrice());
    }
}
