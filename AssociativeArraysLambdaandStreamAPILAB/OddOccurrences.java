package AssociativeArraysLambdaandStreamAPILAB;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().split(" ");
        Map<String,Integer> wordsCount = new LinkedHashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordsCount.putIfAbsent(word,1);
            int value = wordsCount.get(word);
            wordsCount.put(word,value + 1);
        }
        List<String> wordsOddCount = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) {
            if(entry.getValue() % 2 == 0){
                wordsOddCount.add(entry.getKey());
            }
        }
        for (int i = 0; i < wordsOddCount.size() - 1; i++){
            System.out.print(wordsOddCount.get(i) + ", ");
        }
        System.out.print(wordsOddCount.get(wordsOddCount.size() - 1));
    }
}
