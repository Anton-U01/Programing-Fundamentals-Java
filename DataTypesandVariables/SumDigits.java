package DataTypesandVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
