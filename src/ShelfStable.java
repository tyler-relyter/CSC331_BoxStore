/**
 * Represents a shelf-stable food item in inventory.
 * Extends FoodItem and applies a shelf-stable specific tax rate to the base price.
 *
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * @version 1.0
 * @since 2025-10
 * CSC 331-003
 */
public class ShelfStable extends FoodItem {
    private double shelfStableTax;

    /**
     * Constructs a ShelfStable item with the given attributes.
     *
     * @param name           the display name of the item
     * @param price          the base unit price of the item (before tax)
     * @param department     the department name this item belongs to
     * @param stockQuantity  the initial stock quantity
     * @param sku            the SKU identifier
     * @param Color          the color description for the item
     * @param shelfStableTax the tax rate to apply for shelf-stable items (decimal, e.g. 0.07 for 7%)
     */
    public ShelfStable(String name, double price, String department, int stockQuantity, String sku, String Color, double shelfStableTax) {
        super(name, price, department, stockQuantity, sku, Color);
        this.shelfStableTax = shelfStableTax;
    }

    /**
     * Returns the shelf-stable tax rate for this item.
     *
     * @return the shelf-stable tax as a decimal (e.g. 0.07 for 7%)
     */
    public double getshelfStableTax() {
        return shelfStableTax;
    }

    /**
     * Sets the shelf-stable tax rate for this item.
     *
     * @param shelfStableTax the new tax rate to apply (decimal, e.g. 0.07 for 7%)
     */
    public void setshelfStableTax(double shelfStableTax) {
        this.shelfStableTax = shelfStableTax;
    }

    /**
     * Calculates the unit price for this item including the shelf-stable tax.
     *
     * @return the final unit price after applying the shelf-stable tax
     */
    @Override
    public double itemPrice() {
        return super.getPrice() * (1 + this.shelfStableTax);
    }

    /**
     * Returns a formatted string representation of this ShelfStable suitable for display.
     * The output includes superclass fields and the computed taxed price.
     *
     * @return formatted string including item fields and taxed price
     */
    @Override
    public String toString() {
        return String.format("%s$%-15.2f|", super.toString(), itemPrice());
    }

}
