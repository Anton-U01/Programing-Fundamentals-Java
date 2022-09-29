package DataTypesandVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String biggestKeg = "";
        double biggestKegVolume = 0.0;
        for (int i = 0; i < n; i++){
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());
            double currentKegVolume = Math.PI * radius * radius * height;
            if (currentKegVolume > biggestKegVolume){
                biggestKegVolume = currentKegVolume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
