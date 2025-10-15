public class FoodItem extends StoreItem{

    private String Taste;
    private String Color;
    private String Texture;



    public FoodItem(String name, double price, String department, int stockQuantity, String sku, String Color, String texture, String Taste) {
        super(name, price, department, stockQuantity, sku);
        this.Taste = Taste;
        this.Color = Color;
        this.Texture = texture;
        super.setDepartment("Food");

    }

    public FoodItem(String name, double price, String department, int stockQuantity, String sku) {
        super(name, price, department, stockQuantity, sku);
        this.Taste = "";
        this.Color = "";
        this.Texture = "";

    }

    //getter
    public String getTaste(){return Taste;}
    public String getColor(){return Color;}
    public String getTexture(){return Texture;}


    //setter
    public void setTaste(String Taste){this.Taste = Taste;}
    public void setColor(String Color){this.Color = Color;}
    public void setTexture(String Texture){this.Texture = Texture;}




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
    public String toString(){
        return String.format("%s%nAmount: %s %n", super.toString(), getStockQuantity());
    }
}
