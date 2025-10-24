/**
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * Description:
 * This class represents a clothing item in a retail store.
 * It extends the StoreItem class and adds clothing-specific attributes
 * such as size, color, and material.
 */

public class ClothingItem extends StoreItem {
    private double size;
    private String color;
    private String material;
    private double cTAX = 0.05; // 5% tax rate

    // Constructor

    /**
     * Constructs a ClothingItem.
     * @param name String Name of the clothing item
     * @param price double Price of the clothing item
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param size double Size
     * @param color String Color
     * @param material String Material
     */
    public ClothingItem(String name, double price, String department, int stockQuantity, String sku,
                        double size, String color, String material) {
        super(name, price, department, stockQuantity, sku);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    // No-argument constructor
    public ClothingItem() {
        super();
        this.size = 0.0;
        this.color = "";
        this.material = "";
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

    /**
     * Get the clothing tax rate.
     * @return cTAX double representing the clothing tax rate.
     */
    public double getCTAX() { return cTAX; }

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

    public void setCTAX(double cTAX) {
        this.cTAX = cTAX;
    }

    @Override
    public double itemPrice(){return super.getPrice();}

    // Override toString method to include clothing-specific details
    @Override
    public String toString() {
        return String.format("%s%-13.2f|%-15s|%-15s", super.toString(),getSize(),getColor(),getMaterial());
    }
}
