package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        switch (command){
            case "add": addCommand(a,b);
                break;
            case "multiply": multiplyCommand(a,b);
                break;
            case "subtract": subtractCommand (a,b);
                break;
            case "divide": divideCommand (a,b);
                break;
        }
    }

    private static void divideCommand(int a, int b) {
        System.out.println(a / b);
    }

    private static void subtractCommand(int a, int b) {
        System.out.println(a - b);
    }

    private static void multiplyCommand(int a, int b) {
        System.out.println(a * b);
    }

    private static void addCommand(int a, int b) {
        System.out.println(a + b);
    }
}
