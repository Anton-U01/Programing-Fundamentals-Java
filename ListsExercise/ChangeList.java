package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = (Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        String input = scan.nextLine();
        while (!input.equals("end")){
            String[] command = input.split(" ");
            switch (command[0]){
                case "Delete":
                    int i = 0;
                    while (i < numbers.size()){
                        if (numbers.get(i).equals(Integer.parseInt(command[1]))){
                            numbers.remove(i);
                        } else {
                            i++;
                        }
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    numbers.add(index,element);
                    break;
            }
            input = scan.nextLine();
        }
        for (Integer integer : numbers) {
            System.out.print(integer + " ");
        }
    }
}
