/**
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * Description:
 * OuterWear class representing outerwear clothing items.
 * Inherits from ClothingItem.
 */

public class OuterWear extends ClothingItem{
    private boolean isWaterproof;


    // Constructor

    /**
     * Constructs an OuterWear item.
     * @param name String Name of the outerwear
     * @param price double Price of the outerwear
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param size String Size
     * @param color String Color
     * @param material String Material
     * @param isWaterproof boolean Whether the outerwear is waterproof
     */
    public OuterWear(String name, double price, String department, int stockQuantity, String sku,
                    double size, String color, String material, boolean isWaterproof) {
        super(name, price, department, stockQuantity, sku, size, color, material);
        this.isWaterproof = isWaterproof;
    }

    // Getter

    /**
     * Get whether the outerwear is waterproof.
     * @return isWaterproof boolean representing if the outerwear is waterproof.
     */
    public boolean isWaterproof() { return isWaterproof; }

    public double getTaxRate(){ return super.getCTAX(); }

    // Setter

    /**
     * Set whether the outerwear is waterproof.
     * @param isWaterproof boolean representing the new waterproof status of the outerwear.
     */
    public void setWaterproof(boolean isWaterproof) { this.isWaterproof = isWaterproof; }

    @Override
    public double itemPrice(){return super.getPrice()* (1 + getCTAX());}


    // Override toString method to include outerwear-specific details
    @Override
    public String toString() {

        return String.format("%s|%-15s|%-15s|%-15s|$%-15.2f|", super.toString(),"","",isWaterproof(),itemPrice());

    }

}
