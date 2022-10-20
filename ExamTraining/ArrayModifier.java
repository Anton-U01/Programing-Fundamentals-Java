package ExamTraining;

import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separator;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scan.nextLine();
        while(!input.equals("end")){
            String[] data = input.split(" ");
            String command = data[0];
            if(data.length > 1) {
                int index1 = Integer.parseInt(data[1]);
                int index2 = Integer.parseInt(data[2]);
                switch (command) {
                    case "swap":
                        int numberForSwap = numbers[index1];
                        numbers[index1] = numbers[index2];
                        numbers[index2] = numberForSwap;
                        break;
                    case "multiply":
                        numbers[index1] *= numbers[index2];
                        break;
                }
            } else {
                for (int i = 0; i < numbers.length; i++){
                    numbers[i] -= 1;
                }
            }
            input = scan.nextLine();
        }
        String separator = "";
        for (int number : numbers) {
            System.out.print(separator + number);
            separator = ", ";
        }
    }
}
