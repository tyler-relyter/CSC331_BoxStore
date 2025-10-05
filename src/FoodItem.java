public class FoodItem extends StoreItem{

    private String Taste;
    private String Color;
    private String Size;
    private String Texture;



    public FoodItem(String name, double price, String department, int stockQuantity, String sku, String Color, String Size, String texture, String Taste) {
        super(name, price, department, stockQuantity, sku);
        this.Taste = Taste;
        this.Color = Color;
        this.Size = Size;
        this.Texture = texture;
    }

    //getter
    public String getTaste(){return Taste;}
    public String getColor(){return Color;}
    public String getSize(){return Size;}
    public String getTexture(){return Texture;}

    //setter
    public void setTaste(String Name){this.Taste = Taste;}
    public void setColor(String Color){this.Color = Color;}
    public void setSize(String Size){this.Size = Size;}
    public void setTexture(String Texture){this.Texture = Texture;}

}
