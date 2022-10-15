package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String,Integer> totalResources = new LinkedHashMap<>();
        while(!input.equals("stop")){
            String resource = input;
            int quantity = Integer.parseInt(scan.nextLine());
            if(totalResources.containsKey(resource)){
                totalResources.put(resource, totalResources.get(resource) + quantity);
            } else {
                totalResources.put(resource,quantity);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : totalResources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
