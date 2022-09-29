package MethodsLab;

import java.util.Scanner;

public class DeclaringandInvokingMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        signOfInt(n);
    }
    static void signOfInt (int number){
        if (number > 0){
            System.out.print("The number " + number + " is positive.");
        } else if (number < 0){
            System.out.print("The number " + number + " is negative.");
        } else {
            System.out.print("The number " + number + " is zero.");
        }
    }
}


