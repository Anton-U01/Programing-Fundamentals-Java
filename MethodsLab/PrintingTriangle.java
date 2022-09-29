package MethodsLab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        increasingNumbers(n);
        decreasingNumbers(n);
    }

    private static void decreasingNumbers(int n) {
        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                if (j < n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    private static void increasingNumbers(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++) {
                if (j < n) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

}
