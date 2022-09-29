package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = findMiddleChar(text);
        System.out.println(result);
    }

    private static String findMiddleChar(String text) {
        String result = "";
        if (text.length() % 2 == 0){
            result = String.valueOf((text.charAt(text.length() / 2 - 1 )) + String.valueOf(text.charAt(text.length() / 2)));
        } else {
            result =  String.valueOf(text.charAt(text.length() / 2));
        }
        return result;
    }
}
