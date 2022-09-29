package DataTypesandVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startingYield = Integer.parseInt(scan.nextLine());
        int days = 0;
        int totalAmount = 0;
        while (startingYield >= 100){
            totalAmount += startingYield;
            totalAmount -= 26;
            startingYield -= 10;
            days++;
        }
        totalAmount -= 26;
        System.out.println(days);
        System.out.println(totalAmount);
    }
}
