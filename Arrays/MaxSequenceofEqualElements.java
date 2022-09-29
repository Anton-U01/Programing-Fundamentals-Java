package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 1;
        int maxCount = 0;
        int numberFromMaxSequence = 0;
        for (int i = 1; i < numbers.length; i++){
                if (numbers[i] == numbers[i - 1]){
                    count++;
                    if (count > maxCount){
                        maxCount = count;
                        numberFromMaxSequence = numbers[i];
                    }
            }
                else {
                    count = 1;
                }
        }
        for (int i = 0; i < maxCount; i++){
            System.out.print(numberFromMaxSequence + " ");
        }

}
}
