public class CleaningSupply extends HouseHoldItem{
    private String cleaningType; // Example: detergent, disinfectant, glass cleaner

    // Constructor
    /**
     * Constructs a CleaningSupply item.
     * @param name String Name of the cleaning supply
     * @param price double Price of the cleaning supply
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param description String Description
     * @param room String Room where the item is typically used
     * @param material String Material
     * @param cleaningType String Type of cleaning supply
     */
    public CleaningSupply(String name, double price, String department, int stockQuantity, String sku,
                         String brand, String description, String room, String material, String cleaningType) {
        super(name, price, department, stockQuantity, sku, brand, description, room, material);
        this.cleaningType = cleaningType;
    }

    // Getter
    /**
     * Get the type of cleaning supply.
     * @return cleaningType String representing the type of cleaning supply.
     */
    public String getCleaningType() { return cleaningType; }

    // Setter
    /**
     * Set the type of cleaning supply.
     * @param cleaningType String representing the new type of cleaning supply.
     */
    public void setCleaningType(String cleaningType) { this.cleaningType = cleaningType; }

    // Override toString method to include cleaning supply-specific details
    @Override
    public String toString() {
        return super.toString() + ", Cleaning Type: " + cleaningType;
    }

}
