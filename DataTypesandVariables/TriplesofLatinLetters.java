package DataTypesandVariables;

import java.util.Scanner;

public class TriplesofLatinLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i <= n-1; i++)
            for (int j = 0; j <= n-1; j++)
                for (int k = 0; k <= n-1; k++) {
                    char first = (char) ('a' + i);
                    char second = (char) ('a' + j );
                    char third = (char) ('a' + k);
                    System.out.printf("%c%c%c\n",first,second,third);
                }
    }
}
