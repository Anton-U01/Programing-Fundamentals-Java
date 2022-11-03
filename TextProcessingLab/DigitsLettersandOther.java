package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersandOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder symbols = new StringBuilder();
        String line = scan.nextLine();
        for(int i = 0; i < line.length(); i++){
            if(Character.isDigit(line.charAt(i))){
                digits.append(line.charAt(i));
            } else if (Character.isLetter(line.charAt(i))){
                letters.append(line.charAt(i));
            } else{
                symbols.append(line.charAt(i));
            }
        }
        String digitsString = digits.toString();
        System.out.println(digitsString);
        String lettersString = letters.toString();
        System.out.println(lettersString);
        String symbolsString = symbols.toString();
        System.out.println(symbolsString);
    }
}
