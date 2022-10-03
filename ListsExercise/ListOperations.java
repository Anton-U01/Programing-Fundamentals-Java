package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = (Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String input = scan.nextLine();
        while (!input.equals("End")){
            String[] command = input.split(" ");
            switch (command[0]){
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Remove":
                    if (Integer.parseInt(command[1]) > numbers.size()){
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(Integer.parseInt(command[1]));
                    }
                    break;
                case "Shift":
                    if (command[1].equals("right")){
                        for (int i = 0; i < Integer.parseInt(command[2]); i++){
                            numbers.add(0,numbers.get(numbers.size() - 1));
                            numbers.remove(numbers.size() - 1);
                        }
                    } else if(command[1].equals("left")){
                        for (int i = 0; i < Integer.parseInt(command[2]); i++){
                            numbers.add(numbers.size(),numbers.get(0));
                            numbers.remove(0);
                        }
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(command[2]) > numbers.size()){
                        System.out.println("Invalid index.");
                    } else {
                        int index = Integer.parseInt(command[2]);
                        int number = Integer.parseInt(command[1]);
                        numbers.add(index, number);
                    }
                    break;
            }
            input = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
