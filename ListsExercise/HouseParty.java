package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List <String> names = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String input = scan.nextLine();
            String[] command = input.split(" ");
            if(command[2].equals("going!")){
                if(names.contains(command[0])){
                    System.out.println(command[0] + " is already in the list!");
                } else {
                    names.add(command[0]);
                }
            } else {
                if (names.contains(command[0])) {
                    names.remove(command[0]);
                } else {
                    System.out.println(command[0] + " is not in the list!");
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
