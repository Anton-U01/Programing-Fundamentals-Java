package TextProcessingLab;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        while(!word.equals("end")){
            char[] reverse = new char[word.length()];
            for(int i = 0; i < word.length(); i++){
                reverse[i] = word.charAt(word.length() - i - 1);
            }
            System.out.println(word + " = " + String.valueOf(reverse));
            word = scan.nextLine();
        }
    }
}
