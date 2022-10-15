package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<Character,Integer> charCounts = new LinkedHashMap<>();
        for (int i = 0; i < line.length(); i++){
            char c = line.charAt(i);
            if(c != 32){
                if(charCounts.containsKey(c)){
                    charCounts.put(c,charCounts.get(c) + 1);
                } else {
                    charCounts.put(c,1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
