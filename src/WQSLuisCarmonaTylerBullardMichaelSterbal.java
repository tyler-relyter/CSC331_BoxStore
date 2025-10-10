
import java.util.Scanner;
import java.util.ArrayList;

public class WQSLuisCarmonaTylerBullardMichaelSterbal {
    static Scanner input = new Scanner(System.in);

    static StoreItem[] FoofItems;

    public static void main(String[] args) {
        createInventory();
        Casechosen();
    }

    public static void createInventory(){
        Fruit Strawberry = new Fruit("Strawberry", 5.00, "Fruits", 5, "A215", "red", "rough","sweet",3.00, 2);
        Fruit Apple = new Fruit("Apple", 5.00, "Fruits", 10, "A215", "red", "rough","sweet",3.00, 3);
        Fruit Mango = new Fruit("Mango", 5.00, "Fruits", 3, "A215", "red", "rough","sweet",3.00, 4);
        Fruit Grape = new Fruit("Grape", 5.00, "Fruits", 2, "A215", "red", "rough","sweet",3.00, 4);



        FoofItems = new StoreItem[]{Strawberry, Apple, Mango, Grape};
    }


    public static void diplsayFoodItems(){

        System.out.println("-------------Available Fruits-------------");
        for (StoreItem currentItem: FoofItems) {
            if (currentItem instanceof FoodItem) {
                System.out.println(currentItem);
                System.out.println("-----------------------------------------");
            }
        }

        System.out.printf("would like to %n1.)Add to Existing item  %n2.)Create a new Food Item%n");
        System.out.print("Enter your choice: ");
        int createOrAdd = input.nextInt();

        if (createOrAdd == 1) {
            int foodChoice = options(1);
            addFooditmes(foodChoice);
        }
    }

    public static void Casechosen() {
        System.out.println("---Welcome to the Wilmington Quick Shop---");
        System.out.printf("%s%n%s%n%s%n%s", "Do you want to Add or Purchase and item?", "1.) Add", "2.) Purchase",
                "Please enter your choice: ");
        int buyOrAdd = input.nextInt();
        addOrSell(buyOrAdd);
    }

    public static void addFooditmes(int foodChoice) {
        System.out.println("-------------Add Food Items to existing inventory-------------");

        boolean cont = true;
        while (cont){
            System.out.print("Name of item do you want to add to inventory?: ");
            String name = input.next();

            System.out.print("Amount you want to add: ");
            int amount = input.nextInt();


            boolean found = false;

            for (StoreItem item : FoofItems) {
                if (item instanceof FoodItem && item.getName().equalsIgnoreCase(name)) {
                    ((FoodItem) item).addStock(amount);
                    System.out.println("Stock has been updated, the new quantity of " + name + ": " + item.getStockQuantity());
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Item not found in inventory. Cannot add stock.");
            }
            System.out.print("Add another item? (y/n): ");
            if (input.next().equalsIgnoreCase("n")) {
                System.out.println("--------UPDATED FOOD INVENTORY------------");
                for (StoreItem currentItem: FoofItems) {
                    if (currentItem instanceof FoodItem) {
                        System.out.printf("%s: %d%n",currentItem.getName(), currentItem.getStockQuantity());
                        System.out.println("-----------------------------------------");
                    }
                }
                cont = false;
            }
        }

    }

    public static void addOrSell(int addOrSell) {
        Scanner input = new Scanner(System.in);
        if (addOrSell == 1) {
            System.out.println("---Choose  what would you like to Add---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items", "5.) Go back to main menu");
            System.out.print("Choose an option: ");
            int Choice = input.nextInt();
            if (Choice == 5) {
                Casechosen();

            }
            if (Choice == 1) {
                diplsayFoodItems();
            }

        } else if (addOrSell == 2) {
            System.out.println("---Choose  what would you like to Buy---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items","5.) Go back to main menu");
            System.out.println("Choose an option: ");
            int Choice = input.nextInt();
            if(Choice == 5) {
                Casechosen();
            }
            options(Choice);
        }
    }


    public static int options(int Choice) {
        Scanner input = new Scanner(System.in);
        switch (Choice) {
            case 1:
                System.out.println("--- CHOOS FOOD ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Fruit", "2.) Vegetable", "3.) Shelf Stable", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int foodItemChoice = input.nextInt();
                if (foodItemChoice == 4) {
                    Casechosen();
                }
                return foodItemChoice;

            case 2:
                System.out.println("--- CHOOS HOUSE HOLD ITEM ---");
                System.out.printf("%s%n%s%n%s%n", "1.) Cleaning Supply", "2.) Furniture", "3.) Main Menu");
                System.out.println("Choose an option: ");
                int HouseItemChoice = input.nextInt();
                if (HouseItemChoice == 3) {
                    Casechosen();
                }
                break;
            case 3:
                System.out.println("--- CHOOS ELECTRONIC ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Laptop", "2.) Phone", "3.) TV", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int ElectronicItemChoice = input.nextInt();
                if (ElectronicItemChoice == 4) {
                    Casechosen();
                }
                break;
            case 4:
                System.out.println("--- CHOOS CLOTHING ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Outer Wear", "2.) Shoe", "3.) Shirt", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int ClothingItemChoice = input.nextInt();
                if (ClothingItemChoice == 4) {
                    Casechosen();
                }
                break;
        }
    return Choice;
    }

}

