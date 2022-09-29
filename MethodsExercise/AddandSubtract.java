package MethodsExercise;

import java.util.Scanner;

public class AddandSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int result = susbtractThirdFromSum(sumFirstAndSecond(a,b),c);
        System.out.println(result);
    }

    private static int susbtractThirdFromSum(int sumFirstAndSecond, int c) {
        return sumFirstAndSecond - c;
    }

    private static int sumFirstAndSecond(int a, int b) {
        return a + b;
    }
}
