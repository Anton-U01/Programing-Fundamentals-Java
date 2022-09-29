package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String insert1 = scan.nextLine();
        String insert2 = scan.nextLine();
        String [] array1 = insert1.split(" ");
        String [] array2 = insert2.split(" ");

        for (String first : array2) {
            for (String second : array1) {
                if (second.equals(first)){
                    System.out.print(first + " ");
                }
            }
        }


    }
}
