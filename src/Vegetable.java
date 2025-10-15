public class Vegetable extends FoodItem {

    private boolean isOrganic;

    public Vegetable(String name, double price, String department, int stockQuantity, String sku, String Color, String Texture, String Taste, boolean isOrganic) {
        super(name, price, department, stockQuantity, sku, Color, Texture, Taste);
        this.isOrganic = isOrganic;
    }

    //getters

    /**
     * Check if the vegetable is organic.
     * @return isOrganic boolean representing if the vegetable is organic.
     */
    public boolean getIsOrganic() { return isOrganic; }

    //setters

    /**
     * Set whether the vegetable is organic.
     * @param isOrganic boolean representing the new organic status of the vegetable.
     */
    public void setIsOrganic(boolean isOrganic) { this.isOrganic = isOrganic; }


    // Override toString method to include vegetable-specific details
    @Override
    public String toString() {
        return String.format("%sIs Organic: %s", super.toString(), getIsOrganic() ? "Yes" : "No");
    }
}
