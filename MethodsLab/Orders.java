package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());
        sumThePrice (product,quantity);
    }

    private static void sumThePrice(String product, int quantity) {
        switch (product){
            case "coffee":
                System.out.printf("%.2f",1.50 * quantity);
                break;
            case "water":
                System.out.printf("%.2f",1.00 * quantity);
                break;
            case "coke":
                System.out.printf("%.2f",1.40 * quantity);
                break;
            case "snacks":
                System.out.printf("%.2f",2.00 * quantity);
                break;
        }
    }
}
