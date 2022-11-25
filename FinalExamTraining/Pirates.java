package FinalExamTraining;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        Map<String,Integer[]> towns = new HashMap<>();
        while(!line.equals("Sail")){
            String[] data = line.split("\\|\\|");
            String name = data[0];
            Integer[] populationAndGold = {Integer.parseInt(data[1]),Integer.parseInt(data[2])};
            if(towns.containsKey(name)){
                populationAndGold[0] += towns.get(name)[0];
                populationAndGold[1] += towns.get(name)[1];
                towns.put(name,populationAndGold);
            } else {
                towns.put(name,populationAndGold);
            }
            line = scan.nextLine();
        }
        String input = scan.nextLine();
        while(!input.equals("End")){
            String data[] = input.split("=>");
            String command = data[0];
            String town = data[1];
            int killedPeople = Integer.parseInt(data[2]);
            switch (command){
                case "Plunder":
                    int leftPeople = towns.get(town)[0] - killedPeople;
                    int takenGold = Integer.parseInt(data[3]);
                    if(leftPeople <= 0){
                        System.out.println(town + " has been wiped off the map!");
                        towns.remove(town);
                        break;
                    } else {
                        towns.get(town)[0] = leftPeople;
                    }
                    System.out.println(town + " plundered! " + takenGold + " gold stolen, " + killedPeople + " citizens killed.");
                    int leftGold = towns.get(town)[1] - takenGold;
                    if(leftGold <= 0){
                        System.out.println(town + " has been wiped off the map!");
                        towns.remove(town);
                    } else {
                        towns.get(town)[1] = leftGold;
                    }
                    break;
                case "Prosper":
                    int gold = Integer.parseInt(data[2]);
                    if(gold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        towns.get(town)[1] += gold;
                        System.out.println(gold + " gold added to the city treasury. " + town + " now has " + towns.get(town)[1] + " gold.");
                    }
                    break;
            }
            input = scan.nextLine();
        }
        if(towns.size() > 0){
            System.out.println("Ahoy, Captain! There are " + towns.size() + " wealthy settlements to go to:");
            for (Map.Entry<String, Integer[]> entry : towns.entrySet()) {
                System.out.println(entry.getKey() + " -> Population: " + entry.getValue()[0] + " citizens, Gold: " + entry.getValue()[1] + " kg");
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
