package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] input = scan.nextLine().split(" ");
        int bombNumber = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(bombNumber)) {
                if (i >= power && i + power <= numbers.size() - 1) {
                    for (int j = i + power; j >= i - power; j--) {
                        numbers.remove(j);
                    }
                    i = i - power;
                } else if (i < power) {
                    for (int j = i + power; j >= 0; j--) {
                        numbers.remove(j);
                    }
                    i = 0;
                } else if (i + power > numbers.size() - 1) {
                    for (int j = numbers.size() - 1; j >= i - power; j--) {
                        numbers.remove(j);
                    }
                    i = i - power;
                }
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.print(sum + " ");
    }
}
