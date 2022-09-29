package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int area = rectangleArea (a,b);
        System.out.println(area);
    }

    private static int rectangleArea(int a, int b) {
        return a * b;
    }
}
