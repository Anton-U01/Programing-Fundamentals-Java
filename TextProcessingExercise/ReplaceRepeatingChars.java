package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        StringBuilder newText = new StringBuilder();
        char currentChar = line.charAt(0);
        newText.append(line.charAt(0));
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) != currentChar){
                newText.append(line.charAt(i));
                currentChar = line.charAt(i);
            }
        }
        System.out.println(newText);
    }
}
