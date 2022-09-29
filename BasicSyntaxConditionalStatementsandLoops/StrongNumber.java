package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int number = Integer.parseInt(input);
        int num = number;
        int sumOfFact = 0;
        for (int i = 0; i < input.length();i++){
            int digit = num % 10;
            int fact = 1;
            for (int j = 1; j <= digit; j++){
                fact *= j;
            }
            sumOfFact += fact;
            num = num / 10;
        }
        if (sumOfFact == number){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
