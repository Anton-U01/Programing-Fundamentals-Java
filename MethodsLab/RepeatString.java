package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int count = scan.nextInt();
        String newText = newText(text,count);
        System.out.println(newText);
    }

    private static String newText(String text, int count) {
        String result = "";
        for (int i = 0; i < count; i++){
            result += text;
        }
        return result;
    }
}
