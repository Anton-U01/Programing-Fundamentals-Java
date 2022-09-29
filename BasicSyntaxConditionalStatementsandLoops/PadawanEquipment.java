package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budget = Double.parseDouble(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        double lightsaberPrice = Double.parseDouble(scan.nextLine());
        double robePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());
        double totalLightsabers = Math.ceil(studentsCount + 0.10 * studentsCount);
        int freeBelts = 0;
        if (studentsCount < 6){
            freeBelts = 0;
        } else {
            freeBelts = (int) Math.floor(studentsCount * 1.0 / 6);
        }
        double totalPrice = lightsaberPrice * totalLightsabers + robePrice * studentsCount + beltPrice * (studentsCount - freeBelts);
        if (budget > totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        } else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - budget);
        }
    }
}
