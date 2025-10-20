public class Vegetable extends FoodItem {

    private double vegPrice;

    public Vegetable(String name, double price, String department, int stockQuantity, String sku, String Color,  double vegPrice) {
        super(name, price, department, stockQuantity, sku, Color);
        if (vegPrice <= 0){
            this.vegPrice = 1.50;
        }
        else {
            this.vegPrice = vegPrice;
        }
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
