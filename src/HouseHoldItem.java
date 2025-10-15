public abstract class HouseHoldItem extends StoreItem{

    // ---------- Instance Variables ----------
    private String brand;        // e.g., "Shiny" (can be null or "-")
    private String description;  // short blurb for display


    // Household-specific
    private String room;         // e.g., "Kitchen", "Bath", "Living"
    private String material;     // e.g., "Plastic", "Wood", "Steel"

    // ---------- Constructors ----------
    public HouseHoldItem(String name, double price, String department, int stockQuantity, String sku,
                         String brand, String description, String room, String material) {
        super(name, price, department, stockQuantity, sku);
        this.brand = brand;
        this.description = description;
        this.room = room;
        this.material = material;
        super.setDepartment("HouseHold");
    }

    //no-argument constructor
    public HouseHoldItem() {
        super();
        this.brand = null;
        this.description = null;
        this.room = null;
        this.material = null;
    }

    // ---------- Getters ----------
    public String getBrand() { return brand; }
    public String getDescription() { return description; }
    public String getRoom() { return room; }
    public String getMaterial() { return material; }

    // ---------- Setters ----------
    public void setBrand(String brand) { this.brand = brand; }
    public void setDescription(String description) { this.description = description; }
    public void setRoom(String room) { this.room = room; }
    public void setMaterial(String material) { this.material = material; }
    public String getCategory() { return "HouseHold"; }


    /** Return policy text for this category. */
    public String getReturnPolicy() {
        return "Household items returnable within 14 days with receipt.";
    }

    /** Row-style print for tables. */
    public String toRow() {
        return String.format("%-3s | %-15s | $%7.2f | %3d | %-10s | %-10s | %-10s | %-10s",
                getSku(), getName(), getPrice(), getStockQuantity(),
                (brand == null ? "-" : brand),
                (room == null ? "-" : room),
                (material == null ? "-" : material),
                (description == null ? "-" : description));
    }

    @Override
    public String toString() {
        return String.format("%s [%s] %s (%s) - $%.2f, qty=%d, room=%s, material=%s",
                getCategory(), getSku(), getName(), (brand == null ? "-" : brand),
                getPrice(), getStockQuantity(), room, material);
    }
}
