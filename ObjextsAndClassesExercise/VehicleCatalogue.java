package ObjextsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    static class Vehicles{
        String type;
        String model;
        String color;
        int horsepower;
        Vehicles(String type,String model,String color,int horsepower){
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }
        String getModel(){
            return this.model;
        }
        String getInfo(){
            return "Type: " + this.type.substring(0,1).toUpperCase() + this.type.substring(1) + "\nModel: " + this.model + "\nColor: "
                    + this.color + "\nHorsepower: " + this.horsepower;
        }
        int getHorsepower(){
            return this.horsepower;
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Vehicles> vehicles = new ArrayList<>();
        while (!input.equals("End")){
            String[] data = input.split(" ");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower = Integer.parseInt(data[3]);
            vehicles.add(new Vehicles(type,model,color,horsepower));
            input = scan.nextLine();
        }
        String searchLine = scan.nextLine();
        while (!searchLine.equals("Close the Catalogue")){
            for(int i = 0; i < vehicles.size();i++){
                if(vehicles.get(i).getModel().equals(searchLine)){
                    System.out.println(vehicles.get(i).getInfo());
                }
            }
            searchLine = scan.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n",getAverageHorsepowerOfCars(vehicles));
        System.out.printf("Trucks have average horsepower of: %.2f.",getAverageHorsepowerOfTrucks(vehicles));
    }


    private static double getAverageHorsepowerOfTrucks(List<Vehicles> vehicles) {
        int sum = 0;
        int trucksCount = 0;
        for (Vehicles vehicle : vehicles) {
            if(vehicle.type.equals("truck")){
                sum += vehicle.horsepower;
                trucksCount++;
            }
        }
        if (sum == 0){
            return 0;
        }
        return sum * 1.0 / trucksCount;
    }

    private static double getAverageHorsepowerOfCars(List<Vehicles> vehicles) {
        int sum = 0;
        int carsCount = 0;
        for (Vehicles vehicle : vehicles) {
            if(vehicle.type.equals("car")){
                sum += vehicle.horsepower;
                carsCount++;
            }
        }
        if (sum == 0){
            return 0;
        }
        return sum * 1.0 / carsCount;
    }
}
