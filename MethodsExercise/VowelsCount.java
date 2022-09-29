package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int vowelsCount = findVowels(text);
        System.out.println(vowelsCount);
    }

    private static int findVowels(String text) {
        int count = 0;
        for(int i = 0; i < text.length();i++){
            if (text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'U' || text.charAt(i) == 'O' || text.charAt(i) == 'I' ||
                    text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'u' || text.charAt(i) == 'o' || text.charAt(i) == 'i'){
                count++;
            }
        }
        return count;
    }
}
