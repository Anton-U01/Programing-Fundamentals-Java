package ExamTraining;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        double priceWithoutTaxes = 0.0;
        while(!(input.equals("special") || input.equals("regular"))){
            double price = Double.parseDouble(input);
            if(price < 0){
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += price;
            }
            input = scan.nextLine();
        }
        double taxes = 0.20 * priceWithoutTaxes;
        double totalPrice = taxes + priceWithoutTaxes;
        if(input.equals("special")){
            totalPrice -= 0.10 * totalPrice;
        }
        if(totalPrice == 0){
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$",priceWithoutTaxes,taxes,totalPrice);
        }
    }
}
