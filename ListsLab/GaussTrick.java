package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String array = scan.nextLine();
        String[] arrayAsString = array.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String number : arrayAsString) {
            numbers.add(Integer.parseInt(number));
        }
        int size = numbers.size();
        for (int i = 0; i < size / 2;i++){
            numbers.set(i,numbers.get(i) + numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
