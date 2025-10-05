public class Fruit extends FoodItem{

    private String Sweet;

    public Fruit(String name, double price, String department, int stockQuantity, String sku, String Color, String Size, String Texture, String Taste, String Sweet) {
        super(name, price, department, stockQuantity, sku, Color, Size, Texture, Taste);
        this.Sweet = Sweet;
    }

    //getter
    public String getSweet(){return Sweet;} ;

    //setter
    public void setSweet(String Sweet){this.Sweet = Sweet;}

    public void isSweet(){
        if(        getSweet().equals("Mango")
                || getSweet().equals("Strawberry")
                || getSweet().equals("Pineapple")
                || getSweet().equals("Banana")
                || getSweet().equals("Grape")
                || getSweet().equals("Cherry")){
            this.setSweet("It's Sweet");
        }
        else{
            this.setSweet("It's Not Sweet");
        }

    }

}
