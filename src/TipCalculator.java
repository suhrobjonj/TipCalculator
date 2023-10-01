// setting up the Scanner for user input

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {

        // getting main user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tip Calculator!!");
        System.out.print("Enter amount of people: ");
        int numPeople = scan.nextInt();
        System.out.print("Enter tip percentage: ");
        int percentTip = scan.nextInt();

        //initializing variables for the while loop
        double totalPriceBeforeTip = 0;
        String itemList = "\n";
        String itemName;
        int itemCount;
        System.out.print("Enter price of item: ");
        double itemPrice = scan.nextDouble();

        /*
        while loop logic
        user enters item price, count, and name
        total price of item is added to total
        name and count of item is added to the items "list"
         */
        while (itemPrice != -1) {
            scan.nextLine();
            System.out.print("Enter item name: ");
            itemName = scan.nextLine();
            System.out.print("Total number of " + itemName + " ordered: ");
            itemCount = scan.nextInt();

            // main calculations occur, itemCount is used in  both the total price and the item list
            itemList += (itemName + " x " + itemCount + "\n");
            totalPriceBeforeTip += itemPrice * itemCount;

            System.out.print("Enter price of item (-1 to continue): ");
            itemPrice = scan.nextDouble();
        }

        // calculating total from user input

        // printing lines along with performing certain operations
        double totalTip = totalPriceBeforeTip * ((double) percentTip / 100);
        System.out.println("-----------------------------------------------");
        System.out.println("Total price: $" + String.format("%.2f",totalPriceBeforeTip));
        System.out.println("Tip percentage: " + percentTip + "%");
        System.out.println("Total tip amount: $" + String.format("%.2f",totalTip));
        System.out.println("Total bill after tip: $" + String.format("%.2f",(totalPriceBeforeTip + totalTip)));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",(totalPriceBeforeTip / numPeople)));
        System.out.println("Per person tip cost: $" + String.format("%.2f",(totalTip / numPeople)));
        System.out.println("Total cost per person: $" + String.format("%.2f",((totalPriceBeforeTip + totalTip) / numPeople)));
        System.out.println("-----------------------------------------------");

        // printing item list
        System.out.println("Items ordered: " + itemList);

    }
}
