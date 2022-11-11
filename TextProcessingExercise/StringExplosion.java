package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder line = new StringBuilder(scan.nextLine());
        int power = 0;
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) != '>' && power > 0){
                line.deleteCharAt(i);
                power--;
                i--;
            } else if(line.charAt(i) == '>'){
                power += Integer.parseInt(String.valueOf(line.charAt(i + 1)));
            }
        }
        System.out.println(line);
    }
}
