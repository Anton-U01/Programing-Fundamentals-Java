package Arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line[] = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < rotations; i++){
            String firstElement = line[0];
            for (int j = 0; j < line.length - 1;j++){
                line[j] = line [j+1];
            }
            line[line.length-1] = firstElement;
        }
        for (String s : line) {
            System.out.print(s + " ");
        }
    }
}
