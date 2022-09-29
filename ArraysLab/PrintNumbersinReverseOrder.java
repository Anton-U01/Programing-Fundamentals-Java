package ArraysLab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[n];
        for (int i = numbers.length - 1; i >= 0; i--){
            int input = Integer.parseInt(scan.nextLine());
            numbers[i] = input;
        }
        for (int j = 0; j < numbers.length;j++){
            System.out.print(numbers[j]+ " ");
        }
    }
}
