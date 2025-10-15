public class Furniture extends HouseHoldItem {
    private String type; // Example: chair, table, sofa

    // Constructor
    /**
     * Constructs a Furniture item.
     * @param name String Name of the furniture
     * @param price double Price of the furniture
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param brand String Brand
     * @param description String Description
     * @param room String Room where the item is typically used
     * @param material String Material
     * @param type String Type of furniture
     */
    public Furniture(String name, double price, String department, int stockQuantity, String sku,
                     String brand, String description, String room, String material, String type) {
        super(name, price, department, stockQuantity, sku, brand, description, room, material);
        this.type = type;
    }

    // Getter
    /**
     * Get the type of furniture.
     * @return type String representing the type of furniture.
     */
    public String getType() { return type; }

    // Setter
    /**
     * Set the type of furniture.
     * @param type String representing the new type of furniture.
     */
    public void setType(String type) { this.type = type; }

    // Override toString method to include furniture-specific details
    @Override
    public String toString() {
        return super.toString() + ", Furniture Type: " + type;
    }
}
