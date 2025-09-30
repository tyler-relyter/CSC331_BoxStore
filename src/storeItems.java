//SuperClass

public class storeItems {

    private String Color;
    private String Shape;
    private String Size;
    private String Texture;
    private String Name;
    private Double Price;


// constructor
    public storeItems(String Color, String Shape, String Size, String texture, String Name, double price) {

        this.Color = Color;
        this.Shape = Shape;
        this.Size = Size;
        this.Texture = texture;
        this.Name = Name;
        this.Price = price;
    }

    //getters
    public String getColor(){return Color;}
    public String getShape(){return Shape;}
    public String getSize(){return Size;}
    public String getTexture(){return Texture;}
    public String getTaste(){return Name;}
    public Double getPrice(){return Price;}

    //setters
    public void setColor(String Color){this.Color = Color;}
    public void setShape(String Shape){this.Shape = Shape;}
    public void setSize(String Size){this.Size = Size;}
    public void setTexture(String texture){this.Texture = texture;}
    public void setTaste(String name){this.Name = name;}
    public void setPrice(Double price){this.Price = price;}

    public double taxPrice(){
        return this.Price * (this.Price + .05);
    }

}
