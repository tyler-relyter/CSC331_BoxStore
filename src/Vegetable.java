public class Vegetable extends FoodItems {

    private String Root;

    public Vegetable(String Root, String Color, String Shape, String Size, String Texture, String Name, String Taste, double Price) {
        super(Color, Shape, Size, Texture, Name, Taste, Price);
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
            setRoot("Broccoli");
            }

        }
    }
