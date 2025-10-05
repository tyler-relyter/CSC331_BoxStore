public class Vegetable extends FoodItem {

    private String Root;

    public Vegetable(String name, double price, String department, int stockQuantity, String sku, String Color, String Size, String Texture, String Taste, String Root) {
        super(name, price, department, stockQuantity, sku, Color, Size, Texture, Taste);
        this.Root = Root;
    }

    //getters
    public String getRoot() {return Root;}

    //setters
    public void setRoot(String Root) {this.Root = Root;}

    public void isRooted() {
        if(getRoot().equals("Broccoli")
        || getRoot().equals("Spinach")
        || getRoot().equals("Lettuce")
        || getRoot().equals("Peppers")){
            setRoot("not a rooted vegetable");
        }
        else{
            setRoot("is a Rooted vegetable");
            }

        }
    }
