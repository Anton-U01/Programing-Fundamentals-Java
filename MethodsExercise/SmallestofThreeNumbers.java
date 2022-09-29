package MethodsExercise;

import java.util.Scanner;

public class SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());
        int result = getMinimum(a,b,c);
        System.out.println(result);
    }

    private static int getMinimum(int a, int b, int c) {
        int min = Integer.MAX_VALUE;
        if (a < min){
            min = a;
        }
        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
        return min;
    }
}
