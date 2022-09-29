package ArraysLab;

import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        for (int i = 0; i < array.length / 2; i++){
            String change = array[i];
           array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = change;
        }
        for (String e : array) {
            System.out.print(e + " ");
        }

    }
}
