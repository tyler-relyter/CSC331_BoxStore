
import java.util.Scanner;

public class WQSLuisCarmonaTylerBullardMichaelSterbal {

    public static void main(String[] args) {

        welcome();
    }

    public static void welcome() {
        Scanner input = new Scanner(System.in);
        System.out.println("---Welcome to the Wilmington Quick Shop---");
        System.out.printf("%s%n%s%n%s%n%s", "Do you Sell or Purchase and item?", "1.) Sell", "2.) Purchase",
                "Please enter your choice:  ");
        int buyOrSell = input.nextInt();
        buyOrSell(buyOrSell);
    }

    public static void buyOrSell(int buyOrSell) {
        Scanner input = new Scanner(System.in);
        if (buyOrSell == 1) {
            System.out.println("---Choose  what would you like to Sell---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items", "5.) Go back to main menu");
            System.out.println("Choose an option: ");
            int Choice = input.nextInt();
            if (Choice == 5) {
                welcome();
            }
            options(Choice);
        } else if (buyOrSell == 2) {
            System.out.println("---Choose  what would you like to Buy---");
            System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1.) Food Items", "2.) House Hold Items", "3.) Electronic Items", "4.) Clothing Items","5.) Go back to main menu");
            System.out.println("Choose an option: ");
            int Choice = input.nextInt();
            if(Choice == 5) {
                welcome();
            }
            options(Choice);
        }
    }


    public static void options(int Choice) {
        Scanner input = new Scanner(System.in);
        switch (Choice) {
            case 1:
                System.out.println("--- CHOOS FOOD ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Fruit", "2.) Vegetable", "3.) Shelf Stable", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int foodItemChoice = input.nextInt();
                if (foodItemChoice == 4) {
                    welcome();
                }
                break;
            case 2:
                System.out.println("--- CHOOS HOUSE HOLD ITEM ---");
                System.out.printf("%s%n%s%n%s%n", "1.) Cleaning Supply", "2.) Furniture", "3.) Main Menu");
                System.out.println("Choose an option: ");
                int HouseItemChoice = input.nextInt();
                if (HouseItemChoice == 3) {
                    welcome();
                }
                break;
            case 3:
                System.out.println("--- CHOOS ELECTRONIC ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Laptop", "2.) Phone", "3.) TV", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int ElectronicItemChoice = input.nextInt();
                if (ElectronicItemChoice == 4) {
                    welcome();
                }
                break;
            case 4:
                System.out.println("--- CHOOS CLOTHING ITEM ---");
                System.out.printf("%s%n%s%n%s%n%s%n", "1.) Outer Wear", "2.) Shoe", "3.) Shirt", "4.) Main Menu");
                System.out.print("Choose an option: ");
                int ClothingItemChoice = input.nextInt();
                if (ClothingItemChoice == 4) {
                    welcome();
                }
                break;
        }
    }
}

