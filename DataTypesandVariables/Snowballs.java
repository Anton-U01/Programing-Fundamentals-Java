package DataTypesandVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int bestValue = 0;
        int bestTime = 0;
        int bestQuality = 0;
        int bestSnow = 0;
        for (int i = 0; i < n; i++){
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            int snowballValue = (int) Math.pow((snowballSnow * 1.0 / snowballTime),snowballQuality);
            if (snowballValue > bestValue){
                bestValue = snowballValue;
                bestQuality = snowballQuality;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)",bestSnow,bestTime,bestValue,bestQuality);
    }
}
