package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scan.nextLine().split("\\|"))
                .collect(Collectors.toList());
        for(int i = numbers.size() - 1; i >= 0; i--){
            String[] array = numbers.get(i).trim().split("\\s+");
            for (int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
            }
        }
    }
}
