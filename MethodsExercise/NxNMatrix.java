package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        matrix(n);
    }

    public static void matrix(int n) {
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}

