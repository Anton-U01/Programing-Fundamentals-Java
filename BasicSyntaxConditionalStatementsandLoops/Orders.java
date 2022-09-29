package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ordersCount = Integer.parseInt(scan.nextLine());
        double totalPrice = 0.0;
        for (int i = 0; i < ordersCount; i++){
            double pricePerCapsule = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            double currentPrice = pricePerCapsule * days * capsulesCount;
            totalPrice += currentPrice;
            System.out.printf("The price for the coffee is: $%.2f\n",currentPrice);
        }
        System.out.printf("Total: $%.2f",totalPrice);
    }
}
