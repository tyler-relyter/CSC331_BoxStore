public class ClothingItem extends StoreItem {

    private String Color;


    public ClothingItem(String name, double price, String department, int stockQuantity, String sku, String Color) {
        super(name, price, department, stockQuantity, sku);
        super.setDepartment("Clothing");
        this.Color = Color;

    }
    //getters
    public String getColor() {return Color;}


    //setter
    public void setColor(String Color) {this.Color = Color;}



    @Override
    public double itemPrice(){ return super.getPrice();}

    @Override
    public String toString(){
        return String.format("%s%nAmount: %s %n", super.toString(), getStockQuantity());
    }
}
