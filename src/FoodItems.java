public class FoodItems extends storeItems{

    private String Taste;

    public FoodItems(String Color, String Shape, String Size, String Texture, String Name, String Taste, double Price) {
        super(Color, Shape, Size, Texture, Name, Price);
        this.Taste = Taste;
    }

    //getter
    public String getTaste(){return Taste;}

    //setter
    public void setTaste(String Name){this.Taste = Taste;}





}
