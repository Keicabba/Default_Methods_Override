package it.figuccia;

public class Tester {
    public static void main(String[] args) {
        // Create 4 new SmartphonePrice objects
        SmartphonePrice prodPrice1 = new SmartphonePrice("Producer", 500.00);
        SmartphonePrice prodPrice2 = new SmartphonePrice("Producer", 600.00);
        SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 600.00);
        SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 700.00);

        // Create 2 new Smartphone objects
        Smartphone smartphone1 = new Smartphone("Nokia", "3310", 2500, prodPrice1, retailPrice1);
        Smartphone smartphone2 = new Smartphone("Samsung", "S10", 3500, prodPrice2, retailPrice2);

        // Print the details of the 2 Smartphone objects
        System.out.println(smartphone1);
        System.out.println(smartphone2);

        // Check if the first smartphone is equal to the second smartphone
        if (smartphone1.equals(smartphone2)) {
            System.out.println("The first smartphone is equal to the second smartphone.");
        } else {
            System.out.println("The first smartphone is not equal to the second smartphone.");
        }

        try {
            // Get a new Smartphone object by cloning the second Smartphone
            Smartphone clonedSmartphone = smartphone2.clone();

            // Print the details of the newly cloned object
            System.out.println(clonedSmartphone);

            // Check if the second smartphone is equal to the newly cloned object
            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("The second smartphone is equal to the cloned smartphone.");
            } else {
                System.out.println("The second smartphone is not equal to the cloned smartphone.");
            }
        } catch (CloneNotSupportedException e) {
            // Print the stack trace of the exception
            e.printStackTrace();
            // Inform the user about the error
            System.out.println("An error occurred while cloning the smartphone.");
        }
    }
}
