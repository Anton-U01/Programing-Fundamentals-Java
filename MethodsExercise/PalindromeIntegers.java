package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while (!input.equals("END")){
            int number = Integer.parseInt(input);
            char[] digits = new char[input.length()];
            for (int i = 0; i < input.length(); i++){
                digits[i] = input.charAt(input.length() - i - 1);
            }
            boolean result = isPalindrom(digits,input);
            System.out.println(result);
            input = scan.nextLine();
        }
    }

    private static boolean isPalindrom(char[] digits,String input) {
        boolean isPalindrome = false;
        for (int i = 0; i < input.length(); i++){
            if (digits[i] == (input.charAt(i))){
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            return true;
        } else {
            return false;
        }
    }
}
