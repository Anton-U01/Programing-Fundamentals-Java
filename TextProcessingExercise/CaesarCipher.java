package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder line = new StringBuilder(scan.nextLine());
        for(int i = 0; i < line.length(); i++){
            line.setCharAt(i, (char) (line.charAt(i) + 3));
        }
        System.out.println(line);
    }
}
