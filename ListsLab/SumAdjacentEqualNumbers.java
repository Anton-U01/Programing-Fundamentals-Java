package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] listsAsArray = input.split(" ");
        List<Double> list = new ArrayList<>(listsAsArray.length);
        for (String s : listsAsArray) {
            list.add(Double.parseDouble(s));
        }
        List<Double> currentList = sumEqualNumbers(list);
        while (currentList.size() != list.size()){
            list = currentList;
            currentList = sumEqualNumbers(list);

        }
        for (Double e : list) {
            System.out.printf("%.1f",e);
            System.out.print(" ");
        }

    }

    private static List<Double> sumEqualNumbers(List<Double> list) {
        int i = 0;
        List<Double> currentList = new ArrayList<>();
        while (i < list.size()){
            if (i < list.size() - 1 && list.get(i).equals(list.get(i + 1))){
                currentList.add(list.get(i) + list.get(i + 1));
                i += 2;
            } else {
                currentList.add(list.get(i));
                i++;
            }
        }
        list = currentList;
        return list;
    }
}
