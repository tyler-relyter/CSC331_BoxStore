/**
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * Description: This class represents a cleaning supply item in a store inventory system.
 * It extends the HouseHoldItem class and includes additional attributes such as scent and cleaning tax.
 */


public class CleaningSupply extends HouseHoldItem {

    private String scent;
    private double cleaningTax;

    // Full constructor

    /**
     * CleaningSupply constructor
     * @param name string
     * @param price double
     * @param department string
     * @param stockQuantity int
     * @param sku string
     * @param material string
     * @param scent string
     * @param cleaningTax double
     */
    public CleaningSupply(String name, double price, String department, int stockQuantity, String sku, String material, String scent, double cleaningTax) {
        super(name, price, department, stockQuantity, sku, material);
        this.scent = scent;
        this.cleaningTax = cleaningTax;
    }

    // getter/setter
    /**
     *
     * @return scent string
     */
    public String getScent() { return scent; }


    /**
     *
     * @return cleaningTax double
     */
    public double getCleaningTax() { return cleaningTax; }

    // Setter
    /**
     *
     * @param scent string
     */
    public void setScent(String scent) { this.scent = scent; }

    /**
     *
     * @param cleaningTax double
     */
    public void  setCleaningTax(double cleaningTax) {this.cleaningTax = cleaningTax; }
    @Override
    public double itemPrice(){
        return  super.getPrice()*(1 + this.getCleaningTax());
    }

    @Override
    public String toString(){
        return String.format("%s|%-15s|$%-15.2f|", super.toString(),getScent(), itemPrice());
    }
}
