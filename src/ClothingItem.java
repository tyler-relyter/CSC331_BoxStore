public abstract class ClothingItem extends StoreItem {
    private double size;
    private String color;
    private String material;

    // Constructor

    /**
     * Constructs a ClothingItem.
     * @param name String Name of the clothing item
     * @param price double Price of the clothing item
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param size String Size
     * @param color String Color
     * @param material String Material
     */
    public ClothingItem(String name, double price, String department, int stockQuantity, String sku,
                        double size, String color, String material) {
        super(name, price, department, stockQuantity, sku);
        this.size = size;
        this.color = color;
        this.material = material;
        super.setDepartment("Clothing");
    }

    // Getters

    /**
     * Get the size of the clothing item.
     *
     * @return size String representing the size of the clothing item.
     */
    public double getSize() { return size; }

    /**
     * Get the color of the clothing item.
     * @return color String representing the color of the clothing item.
     */
    public String getColor() { return color; }

    /**
     * Get the material of the clothing item.
     * @return material String representing the material of the clothing item.
     */
    public String getMaterial() { return material; }

    // Setters

    /**
     * Set the size of the clothing item.
     * @param size String representing the new size of the clothing item.
     */
    public void setSize(double size) { this.size = size; }

    /**
     * Set the color of the clothing item.
     * @param color String representing the new color of the clothing item.
     */
    public void setColor(String color) { this.color = color; }

    /**
     * Set the material of the clothing item.
     * @param material String representing the new material of the clothing item.
     */
    public void setMaterial(String material) { this.material = material; }


    @Override
    public double itemPrice(){return super.getPrice();}


    // Override toString method to include clothing-specific details
    @Override
    public String toString() {
        return String.format("%s, Size: %s, Color: %s, Material: %s",
                super.toString(), size, color, material);
    }
}
