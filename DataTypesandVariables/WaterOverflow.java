package DataTypesandVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int litersInTank = 0;
        for (int i = 0; i < n; i++){
            int liters  = Integer.parseInt(scan.nextLine());
            if (liters < (255 - litersInTank)){
                litersInTank += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(litersInTank);
    }
}
