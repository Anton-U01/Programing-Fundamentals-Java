package AssociativeArraysLambdaandStreamAPILAB;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Double> numbers = (Arrays.stream(input.split(" "))
                .map(Double::parseDouble).collect(Collectors.toList()));
        Map<Double,Integer> countOfNumbers = new TreeMap<>();
        for (Double number : numbers) {
            if(countOfNumbers.containsKey(number)){
                int currentCount = countOfNumbers.get(number);
                countOfNumbers.put(number,currentCount + 1);
            } else {
                countOfNumbers.put(number,1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countOfNumbers.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n",df.format(entry.getKey()),entry.getValue());
        }
    }
}
