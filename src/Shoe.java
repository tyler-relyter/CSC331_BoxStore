public class Shoe extends ClothingItem{
    private String shoeType;// Example: sneakers, boots, sandals

    // Constructor
    /**
     * Constructs a Shoe item.
     * @param name String Name of the shoe
     * @param price double Price of the shoe
     * @param department String Department
     * @param stockQuantity int Stock quantity
     * @param sku String SKU
     * @param size  Size
     * @param color String Color
     * @param material String Material
     * @param shoeType String Type of shoe
     */
    public Shoe(String name, double price, String department, int stockQuantity, String sku,
                 double size, String color, String material, String shoeType) {
        super(name, price, department, stockQuantity, sku, size, color, material);
        this.shoeType = shoeType;

    }

    // Getter
    /**
     * Get the type of shoe.
     * @return shoeType String representing the type of shoe.
     */
    public String getShoeType() { return shoeType; }

    public double getTaxRate(){ return super.getCTAX(); }

    // Setter
    /**
     * Set the type of shoe.
     * @param shoeType String representing the new type of shoe.
     */
    public void setShoeType(String shoeType) { this.shoeType = shoeType; }


    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + super.getCTAX());
    }

    // Override toString method to include shoe-specific details
    @Override
    public String toString() {

        return String.format("%s, Shoe Type: %s", super.toString(), shoeType);

    }
}

