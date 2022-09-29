package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++){
            int currentNumber = i;
            int oddDigitsCount = 0;
            int sum = 0;
            while (currentNumber != 0){
                int digit = currentNumber % 10;
                if (digit % 2 != 0){
                    oddDigitsCount++;
                }
                sum += digit;
                currentNumber /= 10;
            }
            if (sum % 8 == 0 && oddDigitsCount >= 1){
                System.out.println(i);
            }
        }
    }
}
