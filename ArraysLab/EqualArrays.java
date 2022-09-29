package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array1 = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] array2 = Arrays.stream(scan.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean arraysLengthAreEqual = false;
        if (array1.length == array2.length){
            arraysLengthAreEqual = true;
        }
        int sum = 0;
        boolean equalArrays = false;
        int differentIndex = -1;
        if (arraysLengthAreEqual) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    equalArrays = false;
                    differentIndex = i;
                    break;
                } else {
                    sum += array1[i];
                    equalArrays = true;
                }
            }
            if (equalArrays){
                System.out.printf("Arrays are identical. Sum: %d",sum);
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",differentIndex);
            }
        }
    }
}
