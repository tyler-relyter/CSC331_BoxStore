public class Fruit extends FoodItems{

    private String Sweet;

    public Fruit(String Color, String Shape, String Size, String Texture, String Name, String Taste, double Price) {
        super(Color, Shape, Size, Texture, Name, Taste, Price);
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
