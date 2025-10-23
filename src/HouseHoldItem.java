/**
 * Represents a household department item in the store inventory.
 * Extends StoreItem by adding a material field and default department behavior.
 *
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * @version 1.0
 * @since 2025-10
 * CSC 331-003
 */
public class HouseHoldItem extends StoreItem {

    private String material;

    /**
     * Full constructor.
     *
     * @param name          the display name of the household item
     * @param price         the base unit price for the item
     * @param department    the department name this item belongs to
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     * @param material      the material description for the household item
     */
    public HouseHoldItem(String name, double price, String department, int stockQuantity, String sku, String material) {
        super(name, price, department, stockQuantity, sku);
        this.material = material;
    }

    /**
     * Constructor that omits material and sets a default department value.
     *
     *
     * @param name          the display name of the household item
     * @param price         the base unit price for the item
     * @param department    the department name (ignored; defaulted to "Household")
     * @param stockQuantity the initial stock quantity
     * @param sku           the SKU identifier
     */
    public HouseHoldItem(String name, double price, String department, int stockQuantity, String sku) {
        super(name, price, department, stockQuantity, sku);
        super.setDepartment("Household");
        this.material = "";
    }

    /**
     * Returns the material description for this household item.
     *
     * @return the material as a {@link String}
     */
    public String getMaterial() { return material; }

    /**
     * Updates the material description for this household item.
     *
     * @param material new material value to set
     */
    public void setMaterial(String material) { this.material = material; }

    /**
     * Returns the effective unit price for this item.
     *
     * <p>This implementation returns the base price from the superclass without modifications.</p>
     *
     * @return the unit price as a {@code double}
     */
    @Override
    public double itemPrice() { return super.getPrice(); }

    /**
     * Returns a formatted string representation of this household item suitable for display.
     *
     * @return formatted {@link String} including superclass fields and the material field
     */
    @Override
    public String toString(){
        return String.format("%s%-15s", super.toString(), getMaterial());
    }
}
