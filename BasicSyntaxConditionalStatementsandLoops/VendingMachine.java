package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double sum = 0.0;
        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2){
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n",coins);
            }
            input = scan.nextLine();
        }
        String purchase = scan.nextLine();
        while (!purchase.equals("End")){
            switch (purchase){
                case "Nuts":;
                if (sum - 2.0 < 0){
                    System.out.println("Sorry, not enough money");
                    break;
                } else {
                    System.out.println();
                    sum -= 2.0;
                    System.out.println("Purchased Nuts");
                }
                break;
                case "Water": if (sum - 0.7 < 0){
                    System.out.println("Sorry, not enough money");
                    break;
                } else {
                    sum -= 0.7;
                    System.out.println("Purchased Water");
                }
                break;
                case "Crisps": if (sum - 1.5 < 0){
                    System.out.println("Sorry, not enough money");
                    break;
                } else {
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                }
                break;
                case "Soda": if (sum - 0.8 < 0){
                    System.out.println("Sorry, not enough money");
                    break;
                } else {
                    sum -= 0.8;
                    System.out.println("Purchased Soda");
                };
                break;
                case "Coke": if (sum - 1.0 < 0){
                    System.out.println("Sorry, not enough money");
                    break;
                } else {
                    sum -= 1.0;
                    System.out.println("Purchased Coke");
                }
                break;
                default:
                    System.out.println("Invalid product");
            }
            purchase = scan.nextLine();
        }
        System.out.printf("Change: %.2f",sum);
    }
}
