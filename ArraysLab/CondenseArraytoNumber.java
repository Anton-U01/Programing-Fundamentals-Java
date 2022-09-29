package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArraytoNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int repetitionsCount = array.length - 1;
        for (int repetitions = 0; repetitions < repetitionsCount; repetitions++){
            int[] condensedArray = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++){
               condensedArray[i] = array[i] + array[i+1];
           }
            array = condensedArray;
        }
        System.out.println(array[0]);
        }
    }

