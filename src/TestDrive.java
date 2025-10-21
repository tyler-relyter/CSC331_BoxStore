

public class TestDrive {
    public static void main(String[] args) {
        // Create an instance of OuterWear
        OuterWear jacket = new OuterWear("Rain Jacket", 79.99, "Clothing", 50, "RW123", 42.0, "Blue", "Polyester", true);

        // Display the OuterWear details
        System.out.println("OuterWear Details:");
        System.out.println(jacket.toString());

        // Create an instance of ElectronicsItem
        Phone iPhone = new Phone("IPhone 13", 999.99, "Electronics", 30, "PH456", "Apple A15", "13", 128, "iOS", 256,6.1);

        // Display the ElectronicsItem details
        System.out.println("\nElectronicsItem Details:");
        System.out.println(iPhone.toString());

        // Create an instance of Laptop
        Laptop laptop = new Laptop("Gaming Laptop", 1299.99, "Electronics", 20, "LP789", "HP", "HP Sensei", 24, "Intel I7",32, 512, 15.6);

        // Display the Laptop details
        System.out.println("\nLaptop Details:");
        System.out.println(laptop.toString());
    }
}