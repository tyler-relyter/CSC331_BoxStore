public class Shirt extends ClothingItem{
    private String sleeveLength; // e.g., short, long, sleeveless

    // Constructor

    /**
     * Constructs a Shirt item.
     * @param name String Name of the shirt
     * @param price double Price of the shirt
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param size String Size
     * @param color String Color
     * @param material String Material
     * @param sleeveLength String Sleeve length (e.g., short, long, sleeveless)
     */
    public Shirt(String name, double price, String department, int stockQuantity, String sku,
                 String size, String color, String material, String sleeveLength) {
        super(name, price, department, stockQuantity, sku, size, color, material);
        this.sleeveLength = sleeveLength;
    }

    // Getter

    /**
     * Get the sleeve length of the shirt.
     * @return sleeveLength String representing the sleeve length of the shirt.
     */
    public String getSleeveLength() { return sleeveLength; }

    // Setter

    /**
     * Set the sleeve length of the shirt.
     * @param sleeveLength String representing the new sleeve length of the shirt.
     */
    public void setSleeveLength(String sleeveLength) { this.sleeveLength = sleeveLength; }



    // Override toString method to include shirt-specific details
    @Override
    public String toString() {

        return String.format("%s, Sleeve Length: %s", super.toString(), sleeveLength);

    }
}
