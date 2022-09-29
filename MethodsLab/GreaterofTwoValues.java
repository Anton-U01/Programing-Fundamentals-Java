package MethodsLab;

import java.util.Scanner;

public class GreaterofTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String type = scan.nextLine();

        if (type.equals("int")){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = getMax(a,b);
            System.out.println(result);
        } else if (type.equals("char")){
            char a = scan.next().charAt(0);
            char b = scan.next().charAt(0);
            char result = getMax(a,b);
            System.out.println(result);
        } else if (type.equals("string")){
            String a = scan.nextLine();
            String b = scan.nextLine();
            String result = getMax(a,b);
            System.out.println(result);
        }
    }

    private static int getMax(int a, int b) {
        if (a > b){
            return a;
        }
        return b;
    }
    private static char getMax(char a, char b) {
        if (a > b){
            return a;
        }
        return b;
    }
    private static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0){
            return a;
        }
        return b;
    }

}
