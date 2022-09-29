package ArraysLab;

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] day = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
           int input = Integer.parseInt(scan.nextLine()) - 1;
           if (input >= 0 && input < 7){
               System.out.print(day[input]);
           } else {
               System.out.println("Invalid day!");
           }

    }
}
