package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isObtained = false;
        Map<String,Integer> materials = new LinkedHashMap<>();
        materials.put("fragments",0);
        materials.put("shards",0);
        materials.put("motes",0);
        while(!isObtained){
            String line = scan.nextLine();
            String[] data = line.split(" ");
            int quantity = 0;
            String name = "";
            for (int i = 0; i < data.length; i++){
                if(i % 2 == 0){
                    quantity = Integer.parseInt(data[i]);
                } else {
                    name = data[i].toLowerCase();
                    if(materials.containsKey(name)){
                        int currentQuantity = materials.get(name);
                        materials.put(name,currentQuantity + quantity);
                    } else {
                        materials.put(name,quantity);
                    }
                    if(materials.get(name) >= 250 && (name.equals("shards") || name.equals("fragments") || name.equals("motes"))){
                        isObtained = true;
                        materials.put(name,materials.get(name) - 250);
                        switch (name){
                            case "shards":
                                System.out.println("Shadowmourne obtained!");
                                break;
                            case "fragments":
                                System.out.println("Valanyr obtained!");
                                break;
                            case "motes":
                                System.out.println("Dragonwrath obtained!");
                                break;
                        }
                    }
                }
                if(isObtained){
                    break;
                }
            }
        }
        materials.entrySet().stream()
                .filter(s -> s.getKey().equals("shards"))
                .forEach(entry -> {
                    System.out.println("shards: " + entry.getValue());
                });
        materials.entrySet().stream()
                .filter(s -> s.getKey().equals("fragments"))
                .forEach(entry -> {
                    System.out.println("fragments: " + entry.getValue());
                });
        materials.entrySet().stream()
                .filter(s -> s.getKey().equals("motes"))
                .forEach(entry -> {
                    System.out.println("motes: " + entry.getValue());
                });
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            if(!(entry.getKey().equals("shards") || entry.getKey().equals("fragments") || entry.getKey().equals("motes"))){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
