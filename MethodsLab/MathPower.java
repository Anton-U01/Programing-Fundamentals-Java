package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = Double.parseDouble(scan.nextLine());
        int power = scan.nextInt();
        System.out.println(new DecimalFormat("0.####").format(numberToPower(n,power)));
    }

    private static double numberToPower(double n, int power) {
        n = Math.pow(n,power);
        return n;
    }
}
