/**
 * Represents a furniture item in the household department.
 * Extends HouseHoldItem by adding a specific furniture type and a furniture-specific tax.
 *
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * @version 1.0
 * @since 2025-10
 * CSC 331-003
 */
public class Furniture extends HouseHoldItem {

    private String type;   // e.g., "Chair", "Table", "Sofa"
    private double furnitureTax;

    /**
     * Constructs a new Furniture instance with all fields specified.
     *
     * @param name          the display name of the furniture item
     * @param price         the base unit price of the furniture item
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     * @param material      the material description for the furniture
     * @param type          the furniture type (for example "Chair", "Table")
     * @param furnitureTax  the tax rate to apply to this furniture item (expressed as a decimal, e.g. 0.07 for 7%)
     */
    public Furniture(String name, double price, String department, int stockQuantity, String sku, String material, String type, double furnitureTax) {
        super(name, price, department, stockQuantity, sku, material);
        this.type = type;
        this.furnitureTax = furnitureTax;
    }

    /**
     * Returns the furniture type.
     *
     * @return the furniture type string (e.g. "Chair", "Table")
     */
    public String getType() {
        return type;
    }

    /**
     * Returns the furniture-specific tax rate.
     *
     * @return the furniture tax rate as a decimal (for example 0.07 for 7%)
     */
    public double getfurnitureTax() {
        return furnitureTax;
    }

    /**
     * Sets the furniture-specific tax rate.
     *
     * @param furnitureTax the new furniture tax rate (expressed as a decimal, e.g. 0.07 for 7%)
     */
    public void setFurnitureTax(double furnitureTax) {
        this.furnitureTax = furnitureTax;
    }

    /**
     * Updates the furniture type.
     *
     * @param type the new furniture type to set (for example "Sofa")
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Calculates and returns the item price including the furniture tax.
     *
     * @return the final unit price after applying the furniture tax
     */
    @Override
    public double itemPrice() {
        return super.getPrice() * (1 + this.furnitureTax);
    }

    /**
     * Returns a formatted string representation of this Furniture suitable for tabular display.
     *
     * @return formatted string including superclass fields, furniture type, and taxed price
     */
    @Override
    public String toString() {
        return String.format("%s|%-15s|$%-15.2f|", super.toString(), getType(), itemPrice());
    }
}
