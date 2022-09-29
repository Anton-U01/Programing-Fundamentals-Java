package DataTypesandVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());
        int coursesCount = (int )Math.ceil(peopleCount * 1.0 / capacity);
        System.out.println(coursesCount);
    }
}
