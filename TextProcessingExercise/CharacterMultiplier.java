package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] strings = scan.nextLine().split(" ");
        int sum = multiplier(strings[0],strings[1]);
        System.out.println(sum);
    }

    private static int multiplier(String a, String b) {
        int sum = 0;
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        if(a.length() > b.length()){
            for(int i = 0; i < b.length(); i++){
                sum += a1[i] * b1[i];
            }
            for(int j = b.length(); j < a.length(); j++){
                sum += a1[j];
            }
        } else {
            for(int i = 0; i < a.length(); i++){
                sum += a1[i] * b1[i];
            }
            for(int j = a.length(); j < b.length(); j++){
                sum += b1[j];
            }
        }
        return sum;
    }
}
