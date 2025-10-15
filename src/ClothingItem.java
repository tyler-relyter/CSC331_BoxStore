public class ClothingItem extends StoreItem {

    private String Color;
    private double clothingPrice;

    public ClothingItem(String name, double price, String department, int stockQuantity, String sku, String Color, double clothingPrice) {
        super(name, price, department, stockQuantity, sku);
        this.Color = Color;
        this.clothingPrice = clothingPrice;
    }
    //getters
    public String getColor() {return Color;}
    public double getClothingPrice() {return clothingPrice;}

    //setter
    public void setColor(String Color) {this.Color = Color;}
    public void setClothingPrice(double clothingPrice) {this.clothingPrice = clothingPrice;}


    public void addStock(int stock){
        if ( stock >= 0){
            setStockQuantity(getStockQuantity() + stock);
        }
    }

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
    public double itemPrice(){ return clothingPrice;}

    @Override
    public String toString(){
        return String.format("%s%nAmount: %s %n", super.toString(), getStockQuantity());
    }
}
