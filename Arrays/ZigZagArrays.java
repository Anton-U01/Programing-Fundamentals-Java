package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String [] array1 = new String[n];
        String [] array2 = new String[n];
        for (int i = 1; i <= n; i++){
            String [] line = scan.nextLine().split(" ");
            if (i % 2 != 0){
                array1[i - 1] = line[0];
                array2[i - 1] = line [1];
            } else {
                array1[i - 1] = line [1];
                array2[i - 1] = line [0];
            }
        }
        for (String s : array1) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : array2) {
            System.out.print(s + " ");
        }
    }
}
