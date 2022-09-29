package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        isBetween6And10(password);
        consistOnlyLettersAndDigits(password);
        consistAtLeast2Digits(password);
        if ((isBetween6And10(password) && consistAtLeast2Digits(password) && consistOnlyLettersAndDigits(password))){
            System.out.println("Password is valid");
        }
        if (!isBetween6And10(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistOnlyLettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!consistAtLeast2Digits(password)){
            System.out.println("Password must have at least 2 digits");
        }
    }

    private static boolean consistAtLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length();i++){
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57){
                count++;
            }
        }
        if (count >= 2){
            return true;
        } else {
            return false;
        }
    }

    private static boolean consistOnlyLettersAndDigits(String password) {
        boolean isConsist = false;
        for (int i = 0; i < password.length();i++){
            if ((password.charAt(i) >= 48 && password.charAt(i) <= 57) || (password.charAt(i) >= 65 && password.charAt(i) <=90)
            || (password.charAt(i) >= 97 && password.charAt(i) <= 122)){
                isConsist = true;
            } else {
                return false;
            }
        }
        return isConsist;
    }

    private static boolean isBetween6And10(String password) {
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        } else {
            return false;
        }
    }
}
