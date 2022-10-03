package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> numbers = (Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String text = scan.nextLine();
        while(!text.equals("end")){
            String[] inputAsArray = text.split(" ");
            String command = inputAsArray[0];
            switch (command){
                case "Add":
                    int numberToAdd = Integer.parseInt(inputAsArray[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Remove":
                    Integer numberToRemove = Integer.parseInt(inputAsArray[1]);
                    numbers.remove(numberToRemove);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(inputAsArray[1]);
                    numbers.remove(index);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(inputAsArray[1]);
                    int indexToInsertNumber = Integer.parseInt(inputAsArray[2]);
                    numbers.add(indexToInsertNumber,numberToInsert);
                    break;
            }
            text = scan.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
