package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split("\\s+");
        double sum = 0.0;
        for (String string : input) {
            char letterBefore = string.charAt(0);
            int positionLetterBefore = Character.toLowerCase(letterBefore) - 96;
            char letterAfter = string.charAt(string.length() - 1);
            int positionLetterAfter = Character.toLowerCase(letterAfter) - 96;
            double number = Double.parseDouble(string.substring(1,string.length() - 1));
            if(Character.isUpperCase(letterBefore)){
                sum += number / positionLetterBefore;
            } else {
                sum += number * positionLetterBefore;
            }
            if(Character.isUpperCase(letterAfter)){
                sum -= positionLetterAfter;
            } else {
                sum += positionLetterAfter;
            }
        }
        System.out.println(String.format("%.2f",sum));
    }
}
