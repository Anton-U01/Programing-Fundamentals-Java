package MethodsExercise;

import java.util.Scanner;

public class CharactersinRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);
        printCharactersBetween(a,b);
    }

    private static void printCharactersBetween(char a, char b) {
        for (int i = (int)a + 1; i < (int)b; i++){
            System.out.println((char)i);
        }
    }
}
