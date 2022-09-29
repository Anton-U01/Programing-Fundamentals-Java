package ArraysMoreExercicse;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortandPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] arrays = new String[n];
        int[] sums = new int[n];
        for (int i = 0; i < arrays.length; i++){
            arrays[i] = scan.nextLine();
            int sum = 0;
            for (int j = 0; j < arrays[i].length(); j++){
                char ch = arrays[i].charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    ||ch == 'O' || ch == 'U') {
                    sum += ch * arrays[i].length();
                }
                else {
                    sum += ch / arrays[i].length();
                }
            }
            sums[i] = sum;
        }
        Arrays.sort(sums);
        for (int element : sums) {
            System.out.println(element);
        }
    }
}
