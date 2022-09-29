package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isFind = false;
        int index = -1;
        if (numbers.length == 1){
            System.out.println(0);
        } else {
            for (int i = 1; i < numbers.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++){
                leftSum += numbers[j];
            }
            for (int k = i + 1; k < numbers.length; k++){
                rightSum += numbers[k];
            }
            if (rightSum == leftSum){
                isFind = true;
                index = i;
                }
            }
            if (isFind){
                System.out.println(index);
            } else {
                System.out.println("no");
            }
        }
    }
}
