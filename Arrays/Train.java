package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wagonsCount = Integer.parseInt(scan.nextLine());
        int [] wagons = new int [wagonsCount];
        int sumOfPeople = 0;
        for (int i = 0; i < wagonsCount; i++){
            wagons[i] = Integer.parseInt(scan.nextLine());
            sumOfPeople += wagons[i];
        }
        for (int i = 0; i < wagonsCount; i++){
            System.out.print(wagons[i] + " ");
        }
        System.out.println();
        System.out.print(sumOfPeople);
    }
}
