/**
 * @author Luis Carmona
 * @author Tyler Bullard
 * @author Michael Sterbal
 * Date: October 2025
 * Course section: CSC 331-003
 * *
 * Wilmington Quick Shop Demo Application
 * * Version: 1.0
 * Description:
 * This application simulates a simple inventory management and sales system for a convenience store.
 * It allows users to add items to inventory, sell items, and display current inventory across various departments.
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main driver class for Wilmington Quick Shop demo application.
 * Contains inventory initialization, menu handling, display, adding, and selling logic.
 */
public class WQSLuisCarmonaTylerBullardMichaelSterbal {
    static Scanner input = new Scanner(System.in);
    static ArrayList<StoreItem> newItems = new ArrayList<StoreItem>();

    /**
     * Application entry point.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Initialize base inventory and start main menu
        baseInventory();
        caseChosen();
    }

    /**
     * Populate the initial inventory with sample items across departments.
     * <p>
     * Creates various StoreItem subclasses and adds them to the shared inventory list.
     * </p>
     */
    public static void baseInventory() {
        // Create Fruit items
        Fruit apple = new Fruit("Apple", 5.00, "Fruit", 10, "A215", "red",  .3);
        Fruit mango = new Fruit("Mango", 5.00, "Fruit", 3, "A215", "Yellow",  .4);
        newItems.add(apple);
        newItems.add(mango);

        // Vegies
        Vegetable broccoli = new Vegetable("Broccoli", 5.00, "Vegetables", 5, "A215", "Green",  .2);
        Vegetable spinach = new Vegetable("Spinach", 5.00, "Vegetables", 10, "A215", "Green",  .3);
        newItems.add(broccoli);
        newItems.add(spinach);

        // Shelf Stable
        ShelfStable beans = new ShelfStable("Beans", 10.5, "Shelf Stable", 5, "A215", "Black",  .2);
        newItems.add(beans);

        // Clothing Items
        OuterWear jacket = new OuterWear("North Face", 50.00, "Clothing", 10, "A432DE", 12.0, "Black", "Nylon", true);
        OuterWear rainCoat = new OuterWear("Columbia", 60.00, "Clothing", 10, "A432DE", 11.0, "Yellow", "Polyester", true);
        Shirt tshirt = new Shirt("Hanes", 8.00, "Clothing", 10, "A432DE", 9.0, "White", "Cotton", "T-Shirt");
        Shirt polo = new Shirt("Polo", 20.00, "Clothing", 10, "A432DE", 12.0, "Blue", "Cotton", "Polo Shirt");
        Shoe tennisShoe = new Shoe("nike", 11.00, "Clothing", 10, "A432DE", 11.5, "Red", "Synthetic", "Tennis Shoe");
        Shoe boots = new Shoe("Timberland", 80.00, "Clothing", 10, "A432DE", 10.5, "Brown", "Leather", "Boots");
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
        TV samsungTV = new TV("Samsung QLED", 1499.99, "Electronics", 4, "E32345", "Samsung", "Samsung 55 QLED", 36, "QLED", 55.0, true);
        TV lgTV = new TV("LG OLED", 1799.99, "Electronics", 2, "E32346", "LG", "LG 65 OLED", 36, "OLED",65.0, true);
        newItems.add(dellLaptop);
        newItems.add(hpLaptop);
        newItems.add(iphone);
        newItems.add(samsungPhone);
        newItems.add(samsungTV);
        newItems.add(lgTV);

        // Household Items
        CleaningSupply detergent = new CleaningSupply("Detergent", 15.99, "HouseHold", 20, "H12345", "CleanCo", "Lavender",  .2);
        CleaningSupply glassCleaner = new CleaningSupply("Glass Cleaner", 7.99, "HouseHold", 15, "H12346", "Shiny", "Plain",  .2);
        Furniture chair = new Furniture("Dining Chair", 49.99, "Furniture", 10, "H22334", "Wood", "Chair", .2);
        Furniture table = new Furniture("Coffee Table", 89.99, "Furniture", 5, "H22335", "Wood", "Table", .2);
        newItems.add(detergent);
        newItems.add(glassCleaner);
        newItems.add(chair);
        newItems.add(table);
    }

    /**
     * Show the main menu and dispatch the chosen operation.
     * <p>
     * Offers adding items, purchasing, displaying inventory, or exiting.
     * </p>
     */
    public static void caseChosen() {
        // Display main menu and read user selection
        System.out.println("---Welcome to the Wilmington Quick Shop---");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", "What would you you like to do?", "1.) Add item to inventory", "2.) Purchase","3.) Display Inventory", "4.) Exit",
                "Please enter your choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            addToExistingOrNew();
        }
        if (choice == 2){
            System.out.println("---Choose  what department you would like to sell from---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.)Food Items", "2.)House Hold Items", "3.)Electronic Items", "4.)Clothing Items", "5.)Main menu");
            System.out.print("Choose an option: ");
            int deptChoice = input.nextInt();
            if (deptChoice == 5) {
                caseChosen();
            }
            if (deptChoice == 1 || deptChoice == 2 || deptChoice == 3 || deptChoice == 4) {
                sellItems(deptChoice);
            }
        }
        if (choice == 3){
            System.out.println("---Display Inventory---");
            displayItems(1);
            displayItems(2);
            displayItems(3);
            displayItems(4);
            caseChosen();
        }
        if (choice == 4) {
            System.out.println("Thank you for using the Wilmington Quick Shop");
        }
    }

    /**
     * Sell items from a chosen department.
     *
     * <p>
     * Presents items in the selected department, accepts name and quantity to purchase,
     * updates stock by calling removeStock on the matched StoreItem, tracks running total,
     * and prints the final total when the user finishes.
     * </p>
     *
     * @param deptChoice integer representing the department to sell from (1..4)
     */
    public static void sellItems(int deptChoice) {
        // Manage repeated purchases within a department until user finishes
        Scanner input = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.println("Available Items for Purchase:");
            displayItems(deptChoice);

            double totalPrice = 0.0;

            System.out.print("Enter the name of the item you wish to purchase: ");
            String itemName = input.nextLine();
            boolean itemFound = false;
            for (StoreItem item : newItems) {
                if (item.getName().equalsIgnoreCase(itemName)) {
                    itemFound = true;
                    System.out.print("Enter the quantity you wish to purchase: ");
                    int quantity = input.nextInt();
                    if (quantity <= item.getStockQuantity()) {
                        item.removeStock(quantity);
                        totalPrice += item.itemPrice() * quantity;
                        System.out.printf("You have added %d of %s to the shopping cart.%nCurrent total: $%.2f%n", quantity, item.getName(), totalPrice);
                    } else {
                        System.out.println("Insufficient stock available.");
                    }
                    break;
                }
            }
            if (!itemFound) {
                System.out.println("Item not found in inventory.");
            }
            System.out.print("Would you like to purchase another item? (y/n): ");
            String continueChoice = input.next();
            input.nextLine();
            if (continueChoice.equalsIgnoreCase("n")) {
                System.out.printf("Your final total is: $%.2f%n", totalPrice);
                done = true;
            }
        }
        caseChosen();
    }

    /**
     * Display items filtered by department choice.
     *
     * @param inventoryChoice integer representing which department to display:
     *                        1 = Food, 2 = HouseHold, 3 = Electronics, 4 = Clothing
     */
    public static void displayItems(int inventoryChoice){
        // Print formatted lists for each department based on inventoryChoice
        if (inventoryChoice == 1) {
            System.out.println("+--------------------------------Available Food Items Inventories--------------------------------+");
            System.out.println("Name           |Department     |Stock          |SKU            |Color           |Price           |");
            System.out.println("+--------------+---------------+---------------+---------------+----------------+----------------+");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof FoodItem) {
                    System.out.println(currentItem);
                    System.out.println("+--------------+---------------+---------------+---------------+----------------+----------------+");
                }
            }
        }

        if (inventoryChoice == 2) {
            System.out.println("+--------------------------------Available House Hold Items Inventories------------------------------------------+");
            System.out.println("Name           |Department     |Stock          |SKU            |Color           |Scent          |Price           |");
            System.out.println("+--------------+---------------+---------------+---------------+----------------+---------------+----------------+");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof HouseHoldItem) {
                    System.out.println(currentItem);
                    System.out.println("+--------------+---------------+---------------+---------------+----------------+---------------+----------------+");
                }
            }
        }

        if (inventoryChoice == 3) {
            System.out.println("-------------Available Electronic Items Inventories------------");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof ElectronicsItem) {
                    System.out.print(currentItem);
                    System.out.println();
                }
            }
        }

        if (inventoryChoice == 4) {
            System.out.println("-------------Available Clothing Items Inventories------------");
            for (StoreItem currentItem : newItems) {
                if (currentItem instanceof ClothingItem) {
                    System.out.print(currentItem);
                    System.out.println();
                }
            }
        }
    }

    /**
     * Prompt user to add stock to existing items or create new items.
     *
     * <p>
     * Provides a mini-menu to either add to existing inventory, create a new item, or return to main.
     * </p>
     */
    public static void addToExistingOrNew(){
        // Choose whether to add to existing items or create a new item
        System.out.printf("Would like to %n1.)Add to Existing item  %n2.)Create a new Item%n3.)Main menu%n");
        System.out.print("Enter your choice: ");
        int addOrCreate = input.nextInt();
        if (addOrCreate == 1) {
            System.out.printf("1.)Food%n2.)House Hold%n3.)Electronics%n4.)Clothing Items%n");
            System.out.print("Enter your choice: ");
            int addChoice = input.nextInt();
            addExistingItems(addChoice);
        }
        if (addOrCreate == 2){
            addNewItem();
        }
        if (addOrCreate == 3){
            caseChosen();
        }
    }

    /**
     * Add stock to existing items based on the provided department option.
     *
     * <p>
     * Loops to accept item name and amount to add, updates stock and shows updated inventory.
     * </p>
     *
     * @param options integer indicating which department to operate on:
     *                1 = Food, 2 = House Hold, 3 = Electronics, 4 = Clothing
     */
    public static void addExistingItems(int options) {
        // Add stock to items within the chosen department
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
            case 3:
                System.out.println("-------------Add Electronic Items to existing inventory-------------");
                while (cont) {
                    System.out.print("Name of item do you want to add to inventory?: ");
                    String name = input.nextLine();
                    System.out.print("Amount you want to add: ");
                    int amount = input.nextInt();
                    input.nextLine();

                    boolean found = false;

                    for (StoreItem item : newItems) {
                        if (item instanceof ElectronicsItem electronicsItem && item.getName().equalsIgnoreCase(name)) {
                            electronicsItem.addStock(amount);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Item not found in inventory. Cannot add electronics.");
                    }
                    System.out.print("Add another item? (y/n): ");
                    if (input.next().equalsIgnoreCase("n")) {
                        System.out.println("--------UPDATED ELECTRONICS INVENTORY------------");
                        for (StoreItem currentItem : newItems) {
                            if (currentItem instanceof ElectronicsItem) {
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
        caseChosen();
    }

    /**
     * Create a new item and add it to the inventory.
     *
     * <p>
     * Presents department and subtype menus and collects attributes required to construct
     * the appropriate StoreItem subclass, then appends it to the inventory list.
     * </p>
     */
    public static void addNewItem() {
        // Interactive creation of new items across departments and subtypes
        boolean done = false;
        while (!done) {
            System.out.println();
            System.out.println("Choose department to add an item:");
            System.out.println("1.) Food");
            System.out.println("2.) House Hold");
            System.out.println("3.) Electronics");
            System.out.println("4.) Clothing");
            System.out.println("5.) Back to main menu");
            System.out.print("Choice: ");
            int dept = input.nextInt();
            input.nextLine();

            switch (dept) {
                case 1:
                    System.out.println();
                    System.out.println("Food types:");
                    System.out.println("1.) Fruit");
                    System.out.println("2.) Vegetable");
                    System.out.println("3.) Shelf Stable");
                    System.out.println("4.) Back");
                    System.out.print("Choice: ");
                    int c = input.nextInt();
                    input.nextLine();
                    if (c == 4) {
                        break;
                    }
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Price: ");
                    double price = input.nextDouble();
                    input.nextLine();
                    System.out.print("Quantity: ");
                    int qty = input.nextInt();
                    input.nextLine();
                    System.out.print("SKU: ");
                    String sku = input.nextLine();
                    System.out.print("Color: ");
                    String color = input.nextLine();
                    System.out.print("Tax (decimal): ");
                    double tax = input.nextDouble();
                    input.nextLine();
                    if (c == 1) {
                        newItems.add(new Fruit(name, price, "Food", qty, sku, color, tax));
                    }
                    else if (c == 2) {
                        newItems.add(new Vegetable(name, price, "Vegetables", qty, sku, color, tax));
                    }
                    else if (c == 3) {
                        newItems.add(new ShelfStable(name, price, "Shelf Stable", qty, sku, color, tax));
                    }
                    else {
                        System.out.println("Invalid food type.");
                    }
                    System.out.println("Item added.");
                    break;

                case 2:
                    System.out.println();
                    System.out.println("House Hold types:");
                    System.out.println("1.) Cleaning Supply");
                    System.out.println("2.) Furniture");
                    System.out.println("3.) Back");
                    System.out.print("Choice: ");
                    int hc = input.nextInt();
                    input.nextLine();
                    if (hc == 3) {
                        break;
                    }
                    System.out.print("Name: ");
                    String hname = input.nextLine();
                    System.out.print("Price: ");
                    double hprice = input.nextDouble();
                    input.nextLine();
                    System.out.print("Quantity: ");
                    int hqty = input.nextInt();
                    input.nextLine();
                    System.out.print("SKU: ");
                    String hsku = input.nextLine();
                    if (hc == 1) {
                        System.out.print("Material: ");
                        String material = input.nextLine();
                        System.out.print("Scent: ");
                        String scent = input.nextLine();
                        System.out.print("Tax (decimal): ");
                        double htax = input.nextDouble();
                        input.nextLine();
                        newItems.add(new CleaningSupply(hname, hprice, "HouseHold", hqty, hsku, material, scent, htax));
                    }
                    else if (hc == 2) {
                        System.out.print("Material: ");
                        String material2 = input.nextLine();
                        System.out.print("Type: ");
                        String type = input.nextLine();
                        System.out.print("Tax (decimal): ");
                        double htax2 = input.nextDouble();
                        input.nextLine();
                        newItems.add(new Furniture(hname, hprice, "Furniture", hqty, hsku, material2, type, htax2));
                    }
                    else {
                        System.out.println("Invalid house hold type.");
                    }
                    System.out.println("Item added.");
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Electronics types:");
                    System.out.println("1.) Laptop");
                    System.out.println("2.) Phone");
                    System.out.println("3.) TV");
                    System.out.println("4.) Back");
                    System.out.print("Choice: ");
                    int ec = input.nextInt();
                    input.nextLine();
                    if (ec == 4) {
                        break;
                    }
                    System.out.print("Name: ");
                    String ename = input.nextLine();
                    System.out.print("Price: ");
                    double eprice = input.nextDouble();
                    input.nextLine();
                    System.out.print("Quantity: ");
                    int eqty = input.nextInt();
                    input.nextLine();
                    System.out.print("SKU: ");
                    String esku = input.nextLine();
                    System.out.print("Brand: ");
                    String brand = input.nextLine();
                    System.out.print("Model: ");
                    String model = input.nextLine();
                    System.out.print("Warranty months: ");
                    int warranty = input.nextInt();
                    input.nextLine();
                    if (ec == 1) {
                        System.out.print("CPU: ");
                        String cpu = input.nextLine();
                        System.out.print("RAM (GB): ");
                        int ram = input.nextInt();
                        input.nextLine();
                        System.out.print("Storage (GB): ");
                        int storage = input.nextInt();
                        input.nextLine();
                        System.out.print("Screen size (inches): ");
                        double screen = input.nextDouble();
                        input.nextLine();
                        newItems.add(new Laptop(ename, eprice, "Electronics", eqty, esku, brand, model, warranty, cpu, ram, storage, screen));
                    }
                    else if (ec == 2) {
                        System.out.print("OS: ");
                        String os = input.nextLine();
                        System.out.print("Storage (GB): ");
                        int pstorage = input.nextInt();
                        input.nextLine();
                        System.out.print("Screen size (inches): ");
                        double pscreen = input.nextDouble();
                        input.nextLine();
                        newItems.add(new Phone(ename, eprice, "Electronics", eqty, esku, brand, model, warranty, os, pstorage, pscreen));
                    }
                    else if (ec == 3) {
                        System.out.print("Type (e.g. OLED/QLED): ");
                        String tvType = input.nextLine();
                        System.out.print("Screen size (inches): ");
                        double tvScreen = input.nextDouble();
                        input.nextLine();
                        System.out.print("Smart TV? (y/n): ");
                        boolean isSmart = input.next().equalsIgnoreCase("y");
                        input.nextLine();
                        newItems.add(new TV(ename, eprice, "Electronics", eqty, esku, brand, model, warranty, tvType, tvScreen, isSmart));
                    }
                    else {
                        System.out.println("Invalid electronics type.");
                    }
                    System.out.println("Item added.");
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Clothing types:");
                    System.out.println("1.) Outer Wear");
                    System.out.println("2.) Shoe");
                    System.out.println("3.) Shirt");
                    System.out.println("4.) Back");
                    System.out.print("Choice: ");
                    int cc = input.nextInt();
                    input.nextLine();
                    if (cc == 4) {
                        break;
                    }
                    System.out.print("Name: ");
                    String cname = input.nextLine();
                    System.out.print("Price: ");
                    double cprice = input.nextDouble();
                    input.nextLine();
                    System.out.print("Quantity: ");
                    int cqty = input.nextInt();
                    input.nextLine();
                    System.out.print("SKU: ");
                    String csku = input.nextLine();
                    System.out.print("Size (numeric): ");
                    double size = input.nextDouble();
                    input.nextLine();
                    System.out.print("Color: ");
                    String ccolor = input.nextLine();
                    System.out.print("Material: ");
                    String cmaterial = input.nextLine();
                    if (cc == 1) {
                        System.out.print("Is water resistant? (y/n): ");
                        boolean isWater = input.next().equalsIgnoreCase("y");
                        input.nextLine();
                        newItems.add(new OuterWear(cname, cprice, "Clothing", cqty, csku, size, ccolor, cmaterial, isWater));
                    }
                    else if (cc == 2) {
                        System.out.print("Type (e.g. Tennis Shoe, Boots): ");
                        String type = input.nextLine();
                        newItems.add(new Shoe(cname, cprice, "Clothing", cqty, csku, size, ccolor, cmaterial, type));
                    }
                    else if (cc == 3) {
                        System.out.print("Type (e.g. T-Shirt, Polo): ");
                        String type = input.nextLine();
                        newItems.add(new Shirt(cname, cprice, "Clothing", cqty, csku, size, ccolor, cmaterial, type));
                    }
                    else {
                        System.out.println("Invalid clothing type.");
                    }
                    System.out.println("Item added.");
                    break;

                case 5:
                    done = true;
                    caseChosen();
                    break;

                default:
                    System.out.println("Invalid department choice.");
                    break;
            }
        }
    }
}
