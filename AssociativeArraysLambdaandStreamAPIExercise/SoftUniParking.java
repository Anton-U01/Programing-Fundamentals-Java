package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,String> parkingData = new LinkedHashMap<>();
        for (int i = 0; i < n; i++){
            String input = scan.nextLine();
            String[] command = input.split(" ");
            String type = command[0];
            String username = command[1];
            switch (type){
                case "register":
                    String licensePlateNumber = command[2];
                    if(parkingData.containsKey(username)){
                        System.out.println("ERROR: already registered with plate number " + parkingData.get(username));
                    } else {
                        parkingData.put(username,licensePlateNumber);
                        System.out.print(username + " registered " + licensePlateNumber + " successfully\n");
                    }
                    break;
                case "unregister":
                    if(parkingData.containsKey(username)){
                        parkingData.remove(username);
                        System.out.println(username + " unregistered successfully");
                    } else {
                        System.out.println("ERROR: user " + username + " not found");
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : parkingData.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
