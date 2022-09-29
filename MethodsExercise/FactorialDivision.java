package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        long firstFact = findFactorial(a);
        long secondFact = findFactorial(b);
        double result = findFactorial(a) * 1.0  / findFactorial(b);
        System.out.printf("%.2f",result);
    }

    private static long findFactorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++){
            fact = fact * i;
        }
        return fact;
    }

}
