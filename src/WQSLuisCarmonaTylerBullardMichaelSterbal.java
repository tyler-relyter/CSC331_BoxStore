
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WQSLuisCarmonaTylerBullardMichaelSterbal {
    static Scanner input = new Scanner(System.in);

    static ArrayList<StoreItem> newItems = new ArrayList<StoreItem>();

    public static void main(String[] args) {
        baseInventory();
        Casechosen();
    }

    public static void baseInventory() {
        Fruit Apple = new Fruit("Apple", 5.00, "Fruit", 10, "A215", "red",  .3);
        Fruit Mango = new Fruit("Mango", 5.00, "Fruit", 3, "A215", "red",  .4);
        newItems.add(Apple);
        newItems.add(Mango);

        // Vegies
        Vegetable Broccoli = new Vegetable("Broccoli", 5.00, "Vegetables", 5, "A215", "red",  .2);
        Vegetable Spinach = new Vegetable("Spinach", 5.00, "Vegetables", 10, "A215", "red",  .3);
        newItems.add(Broccoli);
        newItems.add(Spinach);

        // Shelf Stable
        ShelfStable beans = new ShelfStable("Beans", 10.5, "Shelf Stable", 5, "A215", "red",  .2);
        newItems.add(beans);

        // Clothing Items



        //Shoes
        Shoe dressShoe = new Shoe("adidas",10.00, "Shoe",10,"A432DE",15.2, "Blakc", "leather","Dress Shoe",.5);
        Shoe tennis = new Shoe("nike",11.00, "Shoe", 10,"A438DE",11.5, "red", "Synthetic", "tennis",.6);
        newItems.add(tennis);
        newItems.add(dressShoe);

    }
    public static void Casechosen() {
        System.out.println("---Welcome to the Wilmington Quick Shop---");
        System.out.printf("%s%n%s%n%s%n%s%n%s", "Do you want to Add or Purchase and item?", "1.) Add", "2.) Purchase","3.) Quit",
                "Please enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            addOrSell(choice);
        }
        if (choice == 2){
            addOrSell(choice);
            }
        if (choice == 3) {
            System.out.println("Thank you for using the Wilmington Quick Shop");
        }

    }

    public static void addOrSell(int addOrSell) {
        Scanner input = new Scanner(System.in);
        if (addOrSell == 1) {
            System.out.println("---Choose  what would you like to Display---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items", "5.) Go back to main menu");
            System.out.print("Choose an option: ");
            int Choice = input.nextInt();
            if (Choice == 5) {
                Casechosen();
            }
            if (Choice == 1 || Choice == 2 || Choice == 3 || Choice == 4)  {
                diplsayItems(Choice);
            }

        } else if (addOrSell == 2) {
            System.out.println("---Choose  what would you like to Buy---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items","5.) Go back to main menu");
            System.out.println("Choose an option: ");
            int Choice = input.nextInt();
            if(Choice == 5) {
                Casechosen();
            }
            sellOptions(Choice);
        }
    }

    public static void diplsayItems(int inventoryChoice){

        if (inventoryChoice == 1) {

            System.out.println("-------------Available Food Items Inventories------------");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof FoodItem) {
                    System.out.printf("%s: %d%n%s%n", currentItem.getName(), currentItem.getStockQuantity(),currentItem.getDepartment());
                    System.out.println("-----------------------------------------");
                }
            }
        }

//        if (inventoryChoice == 2) {
//
//            System.out.println("-------------Available House Hold Items Items Inventories------------");
//            for (StoreItem currentItem : newItems) {
//                if (currentItem instanceof <<ClothingItem>>) {
//                    System.out.printf("Name: %s |Quantity: %d |%S Department", currentItem.getName(), currentItem.getStockQuantity(), currentItem.getDepartment());
//                    System.out.println("-----------------------------------------");
//                }
//            }
//        }

//        if (inventoryChoice == 3) {
//
//            System.out.println("-------------Available Electronic Items Inventories------------");
//            for (StoreItem currentItem : newItems) {
//                if (currentItem instanceof <<ElectronicsItem>>) {
//                    System.out.printf("%s: %d%n %S", currentItem.getName(), currentItem.getStockQuantity(), currentItem.getDepartment());
//                    System.out.println("-----------------------------------------");
//                }
//            }
//        }

        if (inventoryChoice == 4) {

            System.out.println("-------------Available Clothing Items Inventories------------");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof ClothingItem) {
                    System.out.printf("%s: %d%n %S", currentItem.getName(), currentItem.getStockQuantity(), currentItem.getDepartment());
                    System.out.println("-----------------------------------------");
                }
            }
        }
        addToExistingOrNew();
    }


    public static void addToExistingOrNew(){
        System.out.printf("Would like to %n1.)Add to Existing item  %n2.)Create a new Item%n");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.printf("1.)Food%n2.)House Hold%n3.)Electronics%n4.)Clothing Items%n");
            System.out.print("Enter your choice: ");
            int choice2 = input.nextInt();
            addExistingitmes(choice2);
        }
        if (choice == 2){
            System.out.printf("1.)Food%n2.)House Hold%n3.)Electronics%n4.)Clothing Items%n");
            System.out.print("Enter your choice: ");
            int choice3 = input.nextInt();
            addNewItem(choice3);
        }
    }




    public static void addExistingitmes(int options) {
        boolean cont = true;

        switch(options) {
            case 1:
                System.out.println("-------------Add Food Items to existing inventory-------------");
                while (cont) {
                    System.out.print("Name of item do you want to add to inventory?: ");
                    String name = input.next();

                    System.out.print("Amount you want to add: ");
                    int amount = input.nextInt();

                    boolean found = false;

                    for (StoreItem item : newItems) {
                        if (item instanceof FoodItem foodItem && item.getName().equalsIgnoreCase(name)) {
                            foodItem.addStock(amount);
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
                        for (StoreItem currentItem : newItems) {
                            if (currentItem instanceof FoodItem) {
                                System.out.printf("%s: %d%n", currentItem.getName(), currentItem.getStockQuantity());
                                System.out.println("-----------------------------------------");
                            }
                        }
                        cont = false;
                    }
                }
                break;
            case 2:
                System.out.println("-------------Add House Hold Items to existing inventory-------------");
                while (cont) {
                    System.out.print("Name of item do you want to add to inventory?: ");
                    String name = input.next();

                    System.out.print("Amount you want to add: ");
                    int amount = input.nextInt();

                    boolean found = false;

                    for (StoreItem item : newItems) {
                        if (item instanceof ClothingItem foodItem && item.getName().equalsIgnoreCase(name)) {
                            foodItem.addStock(amount);
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
                        for (StoreItem currentItem : newItems) {
                            if (currentItem instanceof HouseHoldItem) {
                                System.out.printf("%s: %d%n", currentItem.getName(), currentItem.getStockQuantity());
                                System.out.println("-----------------------------------------");
                            }
                        }
                        cont = false;
                    }
                }
                break;
            case 4:
                System.out.println("-------------Add House Hold Items to existing inventory-------------");
                while (cont) {
                    System.out.print("Name of item do you want to add to inventory?: ");
                    String name = input.next();

                    System.out.print("Amount you want to add: ");
                    int amount = input.nextInt();

                    boolean found = false;

                    for (StoreItem item : newItems) {
                        if (item instanceof ClothingItem clothingItem && item.getName().equalsIgnoreCase(name)) {
                            clothingItem.addStock(amount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found in inventory. Cannot add clothing.");
                    }
                    System.out.print("Add another item? (y/n): ");
                    if (input.next().equalsIgnoreCase("n")) {
                        System.out.println("--------UPDATED CLOTHING INVENTORY------------");
                        for (StoreItem currentItem : newItems) {
                            if (currentItem instanceof ClothingItem) {
                                System.out.printf("%s: %d%n", currentItem.getName(), currentItem.getStockQuantity());
                                System.out.println("-----------------------------------------");
                            }
                        }
                        cont = false;
                    }
                }
                break;
        }
        Casechosen();
    }

    public static void addNewItem(int choice){
        boolean cont = true;
        while(cont) {
            if (choice == 1) {
                System.out.println("Please enter the following information");
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Price: ");
                double price = input.nextDouble();
                input.nextLine();
                System.out.print("Department: ");
                String department = input.next();
                System.out.print("Quantity: ");
                int stockQuantity = input.nextInt();
                System.out.print("SKU: ");
                String sku = input.next();
                System.out.print("Color: ");
                String color = input.next();

                newItems.add(new FoodItem(name, price, department, stockQuantity, sku, color));
                System.out.print("Add another item? (y/n): ");
                if (input.next().equalsIgnoreCase("n")) {
                    cont = false;
                }

            }

            if (choice == 4) {
                System.out.println("Please enter the following information");
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Price: ");
                double price = input.nextDouble();
                input.nextLine();
                System.out.print("Department: ");
                String department = input.next();
                System.out.print("Quantity: ");
                int stockQuantity = input.nextInt();
                System.out.print("SKU: ");
                String sku = input.next();
                System.out.print("Size: ");
                double size = input.nextDouble();
                input.nextLine();
                System.out.print("Color: ");
                String color = input.next();
                System.out.print("Material:");
                String material = input.next();


                newItems.add(new ClothingItem(name, price, department, stockQuantity, sku, size, color,material));
                System.out.print("Add another item? (y/n): ");
                if (input.next().equalsIgnoreCase("n")) {
                    cont = false;
                }

            }
        }
        diplsayItems(1);

    }




    public static int sellOptions(int Choice) {
        switch (Choice) {
            case 1:
                System.out.println("--- CHOOSE FOOD ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Fruit", "2.) Vegetable", "3.) Shelf Stable", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int foodItemChoice = input.nextInt();
                if (foodItemChoice == 4) {
                    Casechosen();
                }
                return foodItemChoice;

            case 2:
                System.out.println("--- CHOOSE HOUSE HOLD ITEM ---");
                System.out.printf("%s%n%s%n%s%n", "1.) Cleaning Supply", "2.) Furniture", "3.) Main Menu");
                System.out.println("Choose an option: ");
                int HouseItemChoice = input.nextInt();
                if (HouseItemChoice == 3) {
                    Casechosen();
                }
                break;
            case 3:
                System.out.println("--- CHOOSE ELECTRONIC ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Laptop", "2.) Phone", "3.) TV", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int ElectronicItemChoice = input.nextInt();
                if (ElectronicItemChoice == 4) {
                    Casechosen();
                }
                break;
            case 4:
                System.out.println("--- CHOOSE CLOTHING ITEM ---");
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

