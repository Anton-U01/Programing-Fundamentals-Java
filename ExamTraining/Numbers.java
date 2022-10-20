package ExamTraining;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double average = sum * 1.0 / numbers.size();
        List <Integer> greaterNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if(number > average){
                greaterNumbers.add(number);
            }
        }
        greaterNumbers.sort(Collections.reverseOrder());
        if(greaterNumbers.isEmpty()){
            System.out.println("No");
        } else {
            if(greaterNumbers.size() <= 5) {
                for (Integer greaterNumber : greaterNumbers) {
                    System.out.printf("%d ", greaterNumber);
                }
            } else {
                for (int i = 0; i < 5; i++){
                    System.out.printf("%d ", greaterNumbers.get(i));
                }
            }
        }
    }
}
