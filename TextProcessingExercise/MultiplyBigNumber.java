package TextProcessingExercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        int remainder = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = number.length() - 1; i >= 0; i--){
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = remainder + digit * n;
            if(i == 0){
                sb.insert(0,product);
            } else {
                int numberToAdd = product % 10;
                sb.insert(0,numberToAdd);
                remainder = product / 10;
            }
        }
        while(sb.charAt(0) == '0' && sb.length() > 1){
            sb.deleteCharAt(0);
        }
        System.out.println(sb);
    }
}
