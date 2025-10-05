public class HouseHoldItem {
    // ---------- Instance Variables ----------
    private String id;           // unique SKU/id, e.g., "H310"
    private String name;         // e.g., "All-Purpose Spray"
    private String brand;        // e.g., "Shiny" (can be null or "-")
    private String description;  // short blurb for display
    private double price;        // unit price
    private int quantity;        // units in stock

    // Household-specific
    private String room;         // e.g., "Kitchen", "Bath", "Living"
    private String material;     // e.g., "Plastic", "Wood", "Steel"

    // ---------- Constructors ----------
    public HouseHoldItem(String id, String name, String brand, String description,
                         double price, int quantity, String room, String material) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.room = room;
        this.material = material;
    }

    // Optional no-arg constructor
    public HouseHoldItem() {
        this("", "", null, "", 0.0, 0, "", "");
    }

    // ---------- Accessors (Getters) ----------
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getRoom() {
        return room;
    }

    public String getMaterial() {
        return material;
    }

    // ---------- Mutators (Setters) ----------
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // ---------- Behavior ----------

    /**
     * Attempt to sell/purchase a quantity; returns true if successful.
     */
    public boolean purchase(int qty) {
        if (qty <= 0 || qty > quantity) return false;
        quantity -= qty;
        return true;
    }

    /**
     * Add stock (positive quantities only).
     */
    public void restock(int qty) {
        if (qty > 0) quantity += qty;
    }

    /**
     * Category label handy for UI.
     */
    public String getCategory() {
        return "Household";
    }

    /**
     * Example tax rate for non-food goods; adjust per your rubric.
     */
    public double getTaxRate() {
        return 0.07; // 7%
    }

    /**
     * Return policy text for this category.
     */
    public String getReturnPolicy() {
        return "Household items returnable within 14 days with receipt.";
    }

    /**
     * Row-style print for tables.
     */
    public String toRow() {
        return String.format("%-6s | %-14s | %-12s | $%7.2f | %4d | %s",
                id, name, (brand == null ? "-" : brand), price, quantity,
                (description == null ? "" : description));
    }

    @Override
    public String toString() {
        return String.format("%s [%s] %s (%s) - $%.2f, qty=%d, room=%s, material=%s",
                getCategory(), id, name, (brand == null ? "-" : brand),
                price, quantity, room, material);
    }
}
