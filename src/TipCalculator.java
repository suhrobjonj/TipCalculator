import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amountof people: ");
        int numPeople = scan.nextInt();

        System.out.print("Enter tip percentage: ");
        double percentTip = scan.nextDouble();

        double total = 0;
        String items = "";
        String itemName;
        System.out.print("Enter price of item: ");
        double price = scan.nextDouble();

        while (price != -1) {

            System.out.print("Enter item name: ");
            itemName = scan.nextLine();
            items += (itemName + "\n");
            total += price;

            System.out.print("Enter price of item: ");
            price = scan.nextDouble();

        }


    }
}
