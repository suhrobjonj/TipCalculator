import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Tip Calculator!!");
        System.out.print("Enter amount of people: ");
        int numPeople = scan.nextInt();

        System.out.print("Enter tip percentage: ");
        int percentTip = scan.nextInt();

        double total = 0;
        String items = "\n";
        String itemName;
        System.out.print("Enter price of item: ");
        double price = scan.nextDouble();

        while (price != -1) {
            scan.nextLine();
            System.out.print("Enter item name: ");
            itemName = scan.nextLine();
            items += (itemName + "\n");
            total += price;

            System.out.print("Enter price of item (-1 to continue): ");
            price = scan.nextDouble();
        }

        double totalTip = total * (percentTip / 100);
        System.out.println("---------------------------------------------------");
        System.out.println("Total price: $" + String.format("%.2f",total));
        System.out.println("Tip percentage: %" + percentTip);
        System.out.println("Total tip amount: $" + String.format("%.2f",totalTip));
        System.out.println("Total bill after tip: $" + String.format("%.2f",(total + totalTip)));
        System.out.println("Per person cost before tip: $" + String.format("%.2f",(total / numPeople)));
        System.out.println("Per person tip cost: $" + String.format("%.2f",(totalTip / numPeople)));
        System.out.println("Total cost per person: $" + String.format("%.2f",((total + totalTip) / numPeople)));
        System.out.println("---------------------------------------------------");
        System.out.println("Items ordered: " + String.format("%.2f",items));

    }
}
