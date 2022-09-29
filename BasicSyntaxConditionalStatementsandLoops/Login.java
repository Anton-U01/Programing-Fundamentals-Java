package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        String password = "";
        for (int i = username.length()- 1; i >=0; i--){
            password += username.charAt(i);
        }
        String insertPassword = scan.nextLine();
        boolean isBlocked = false;
        int count = 0;
        while (true){
            count++;
            if (count == 4){
                isBlocked = true;
                break;
            }
            if (!insertPassword.equals(password)){
                System.out.println("Incorrect password. Try again.");
            } else {
                break;
            }
            insertPassword = scan.nextLine();
        }
        if (isBlocked){
            System.out.printf("User %s blocked!",username);
        } else {
            System.out.printf("User %s logged in.",username);
        }
    }
}
