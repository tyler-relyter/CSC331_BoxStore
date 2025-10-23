/**
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * Description:
 * This abstract class represents a generic store item in a retail store.
 * It includes common attributes such as name, price, department, stock quantity, and SKU.
 * It also provides methods to manage stock and calculate item price including tax.
 */

public abstract class StoreItem {

    private String name;
    private double price;
    private String department;
    private int stockQuantity;
    private String sku; // Stock Keeping Unit
    protected final double TAX_RATE = 0.07; // 7% tax rate


    // Parameterized constructor

    /**
     * Constructor to initialize a StoreItem with given parameters.
     * @param name String representing the name of the item.
     * @param price double representing the price of the item.
     * @param department String representing the department of the item.
     * @param stockQuantity int representing the stock quantity of the item.
     * @param sku String representing the SKU of the item.
     */
    public StoreItem(String name, double price, String department, int stockQuantity, String sku) {
        this.name = name;
        this.price = price;
        this.department = department;
        this.stockQuantity = stockQuantity;
        this.sku = sku;

    }

    // no-argument constructor
    public StoreItem() {
        this.name = "";
        this.price = 0.0;
        this.department = "";
        this.stockQuantity = 0;
        this.sku = "";
    }

    // Getters/Accessors

    /**
     * Get the name of the store item.
     * @return name String representing the name of the item.
     */
    public String getName() { return name; }

    /**
     * Get the price of the store item.
     * @return price double representing the price of the item.
     */
    public double getPrice() { return price; }

    /**
     * Get the department of the store item.
     * @return department String representing the department of the item.
     */
    public String getDepartment() { return department; }

    /**
     * Get the stock quantity of the store item.
     * @return stockQuantity int representing the stock quantity of the item.
     */
    public int getStockQuantity() { return stockQuantity; }

    /**
     * Get the SKU of the store item.
     * @return sku String representing the SKU of the item.
     */
    public String getSku() { return sku; }

    // Setters/Mutators

    /**
     * Set the name of the store item.
     * @param name String representing the new name of the item.
     */
    public void setName(String name) { this.name = name; }

    /**
     * Set the price of the store item.
     * @param price double representing the new price of the item.
     */
    public void setPrice(double price) { this.price = price; }

    /**
     * Set the department of the store item.
     * @param department String representing the new department of the item.
     */
    public void setDepartment(String department) { this.department = department; }

    /**
     * Set the stock quantity of the store item.
     * @param stockQuantity int representing the new stock quantity of the item.
     */
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }

    /**
     * Set the SKU of the store item.
     * @param sku String representing the new SKU of the item.
     */
    public void setSku(String sku) { this.sku = sku; }


    // Abstract method to calculate item price including tax
    public abstract double itemPrice();

    /**
     * Add stock to the store item.
     * @param stock int representing the amount of stock to add.
     */
    public void addStock(int stock){
        if ( stock >= 0){
            setStockQuantity(getStockQuantity() + stock);
        }
    }


    /**
     * Remove stock from the store item.
     * Ensures that stock quantity does not go below zero.
     * @param stock int representing the amount of stock to remove.
     */
    public void removeStock(int stock){
        if ( stock > 0){
            int stockQuantity = getStockQuantity() - stock;

            if (stockQuantity < 0){
                setStockQuantity(0);
            }
            else{
                setStockQuantity(stockQuantity);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s%nDepartment: %s%nQuantity: %d%nSKU: %s", this.name, this.department, this.stockQuantity, this.sku);
    }
}

