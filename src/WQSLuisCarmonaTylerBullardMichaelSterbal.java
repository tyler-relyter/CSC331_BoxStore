
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
        Fruit apple = new Fruit("Apple", 5.00, "Fruit", 10, "A215", "red",  .3);
        Fruit mango = new Fruit("Mango", 5.00, "Fruit", 3, "A215", "red",  .4);
        newItems.add(apple);
        newItems.add(mango);

        // Vegies
        Vegetable broccoli = new Vegetable("Broccoli", 5.00, "Vegetables", 5, "A215", "red",  .2);
        Vegetable spinach = new Vegetable("Spinach", 5.00, "Vegetables", 10, "A215", "red",  .3);
        newItems.add(broccoli);
        newItems.add(spinach);

        // Shelf Stable
        ShelfStable beans = new ShelfStable("Beans", 10.5, "Shelf Stable", 5, "A215", "red",  .2);
        newItems.add(beans);

        // Clothing Items
        OuterWear jacket = new OuterWear("North Face", 50.00, "Clothing", 10, "A432DE", 12.0, "Black", "Nylon", true);
        OuterWear rainCoat = new OuterWear("Columbia", 60.00, "Clothing", 10, "A432DE", 11.0, "Yellow", "Polyester", true);
        Shirt tshirt = new Shirt("Hanes", 8.00, "Clothing", 10, "A432DE", 9.0, "White", "Cotton", "T-Shirt");
        Shirt polo = new Shirt("Polo", 20.00, "Clothing", 10, "A432DE", 12.0, "Blue", "Cotton", "Polo Shirt");
        Shoe tennisShoe = new Shoe("nike", 11.00, "Clothing", 10, "A432DE", 11.5, "Red", "Synthetic", "Tennis Shoe", .6);
        Shoe boots = new Shoe("Timberland", 80.00, "Clothing", 10, "A432DE", 10.5, "Brown", "Leather", "Boots", .7);
        newItems.add(jacket);
        newItems.add(rainCoat);
        newItems.add(tshirt);
        newItems.add(polo);
        newItems.add(tennisShoe);
        newItems.add(boots);

        // Electronics
        Laptop dellLaptop = new Laptop("Dell XPS 13", 999.99, "Electronics", 5, "E12345", "Dell", "XPS 13", 24, "Intel i7", 16, 512, 13.3);
        Laptop hpLaptop = new Laptop("HP Spectre x360", 1199.99, "Electronics", 3, "E12346", "HP", "Spectre x360", 24, "Intel i9", 32, 1024, 17.0);
        Phone iphone = new Phone("iPhone 14", 799.99, "Electronics", 10, "E22334", "Apple", "iPhone 14", 12, "iOS", 128, 6.1);
        Phone samsungPhone = new Phone("Samsung Galaxy S22", 749.99, "Electronics", 8, "E22335", "Samsung", "Galaxy S22", 12, "Android", 256, 6.2);
        TV samsungTV = new TV("Samsung QLED", 1499.99, "Electronics", 4, "E32345", "Samsung", "Samsung 55 QLED", 36, "QLED", 55.0, true, 0.07);
        TV lgTV = new TV("LG OLED", 1799.99, "Electronics", 2, "E32346", "LG", "LG 65 OLED", 36, "OLED",65.0, true, 0.07);
        newItems.add(dellLaptop);
        newItems.add(hpLaptop);
        newItems.add(iphone);
        newItems.add(samsungPhone);
        newItems.add(samsungTV);
        newItems.add(lgTV);

        // Household Items
        CleaningSupply detergent = new CleaningSupply("Laundry Detergent", 15.99, "HouseHold", 20, "H12345", "CleanCo", "Cleans clothes effectively",  .2);
        CleaningSupply glassCleaner = new CleaningSupply("Glass Cleaner", 7.99, "HouseHold", 15, "H12346", "Shiny", "Leaves glass streak-free",  .2);
        Furniture chair = new Furniture("Dining Chair", 49.99, "HouseHold", 10, "H22334", "Wood", "Chair", .2);
        Furniture table = new Furniture("Coffee Table", 89.99, "HouseHold", 5, "H22335", "Wood", "Table", .2);
        newItems.add(detergent);
        newItems.add(glassCleaner);
        newItems.add(chair);
        newItems.add(table);

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

        if (inventoryChoice == 2) {

            System.out.println("-------------Available House Hold Items Items Inventories------------");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof HouseHoldItem) {
                    System.out.printf("Name: %s |Quantity: %d |%S Department%n", currentItem.getName(), currentItem.getStockQuantity(), currentItem.getDepartment());
                    System.out.println("-----------------------------------------");
                }
            }
        }

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
                System.out.print("Tax (enter as decimal): ");
                double fruitTax = input.nextDouble();

                newItems.add(new Fruit(name, price, department, stockQuantity, sku, color, fruitTax));
                System.out.print("Add another item? (y/n): ");
                if (input.next().equalsIgnoreCase("n")) {
                    cont = false;
                }

            }
            if (choice == 2) {
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
                System.out.print("Tax (enter as decimal): ");
                double vegetableTax = input.nextDouble();

                newItems.add(new Vegetable(name, price, department, stockQuantity, sku, color, vegetableTax));
                System.out.print("Add another item? (y/n): ");
                if (input.next().equalsIgnoreCase("n")) {
                    cont = false;
                }

            }

            if (choice ==3) {
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
                System.out.print("Tax (enter as decimal): ");
                double vegetableTax = input.nextDouble();

                newItems.add(new ShelfStable(name, price, department, stockQuantity, sku, color, vegetableTax));
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
                System.out.print("Material: ");
                String material = input.next();
                input.nextLine();
                System.out.print("Scent: ");
                String scent = input.next();
                System.out.print("CleaningTax:");
                double cleaningTax = input.nextDouble();


                newItems.add(new CleaningSupply(name, price, department, stockQuantity, sku, material, scent, cleaningTax));
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

