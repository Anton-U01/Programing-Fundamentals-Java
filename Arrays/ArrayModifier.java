package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String input = scan.nextLine();
        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command.length > 1) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                switch (command[0]){
                    case "swap":
                        int change = numbers[index1];
                        numbers[index1] = numbers[index2];
                        numbers[index2] = change;
                        break;
                    case "multiply":
                        numbers[index1] *= numbers[index2];
                        break;
            }
            }
            else {
                    for (int i = 0; i < numbers.length; i++){
                        numbers[i] -= 1;
                    }
                }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.length - 1; i++){
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
