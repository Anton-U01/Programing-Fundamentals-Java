package DataTypesandVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startPower = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor = Integer.parseInt(scan.nextLine());
        int targets = 0;
        int power = startPower;
        while (power > distance){
            power -= distance;
            targets++;
            if (startPower / 2 == power){
                power /= exhaustionFactor;
            }
        }
        System.out.println(power);
        System.out.println(targets);
    }
}
