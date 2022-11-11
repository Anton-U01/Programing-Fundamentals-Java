package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(", ");
        for (String username : data) {
            boolean isValid = false;
            if(username.length() >= 3 && username.length() <= 16){
                for(int i = 0; i < username.length(); i++){
                    char symbol = username.charAt(i);
                    if(Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == 45 || symbol == 95){
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if(isValid){
                System.out.println(username);
            }
        }
    }
}
