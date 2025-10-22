public class FoodItem extends StoreItem{

    private String Color;

    public FoodItem(String name, double price, String department, int stockQuantity, String sku, String Color) {
        super(name, price, department, stockQuantity, sku);
        this.Color = Color;

    }

    public FoodItem(String name, double price, String department, int stockQuantity, String sku) {
        super(name, price, department, stockQuantity, sku);
        this.Color = "";
    }

    //getter
    public String getColor(){return Color;}



    //setter
    public void setColor(String Color){this.Color = Color;}


    @Override
    public double itemPrice(){return super.getPrice();}

    @Override
    public String toString(){
        return String.format("%s%-15s|", super.toString(), getColor());
    }
}
