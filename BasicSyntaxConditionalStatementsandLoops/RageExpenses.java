package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());
        double expenses = 0.0;
        int headsetCrashes = (int) Math.floor(lostGames * 1.0 / 2);
        int mouseCrashes = (int) Math.floor(lostGames * 1.0 / 3);
        int keyboardCrashes = (int) Math.floor(lostGames * 1.0 / 6);
        int displayCrashes = (int) Math.floor(lostGames * 1.0 / 6 / 2);
        expenses = headsetCrashes * headsetPrice + keyboardCrashes * keyboardPrice + mouseCrashes * mousePrice + displayCrashes * displayPrice;
        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }
}
