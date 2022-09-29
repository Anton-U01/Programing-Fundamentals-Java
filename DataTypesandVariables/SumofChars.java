package DataTypesandVariables;

import java.util.Scanner;

public class SumofChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++){
            String input = scan.nextLine();
            char symbol = input.charAt(0);
            sum += symbol;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
