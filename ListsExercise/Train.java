package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Integer> wagons = (Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList()));
        int maxCapacityOfWagon = Integer.parseInt(scan.nextLine());
        String text = scan.nextLine();
        while(!text.equals("end")){
            String[] command = text.split(" ");
            if (command[0].equals("Add")){
                Integer newWagon = Integer.parseInt(command[1]);
                wagons.add(newWagon);
            } else {
                int insertPassengers = Integer.parseInt(command[0]);
                for (int i = 0; i < wagons.size();i++){
                    if (maxCapacityOfWagon - wagons.get(i) >= insertPassengers){
                        wagons.set(i,insertPassengers + wagons.get(i));
                        break;
                    }
                }
            }
            text = scan.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
