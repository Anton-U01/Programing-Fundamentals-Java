package FinalExamTraining;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String input = scan.nextLine();
        StringBuilder password = new StringBuilder();
        while (!input.equals("Done")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < line.length(); i++) {
                        if (i % 2 != 0) {
                            password.append(line.charAt(i));
                        }
                    }
                    System.out.println(password);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    if(startIndex + length >= password.length()){
                        length = password.length() - startIndex;
                    }
                    for (int i = 0; i < length; i++) {
                        password.deleteCharAt(startIndex);
                    }
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = data[1];
                    String replacement = data[2];
                    if (password.indexOf(substring) == -1) {
                        System.out.println("Nothing to replace!");
                    } else {
                        while (password.indexOf(substring) != -1) {
                            int indexOfSubstring = password.indexOf(substring);
                            for (int i = 0; i < substring.length(); i++) {
                                password.deleteCharAt(indexOfSubstring);
                            }
                            password.insert(indexOfSubstring, replacement);
                        }
                        System.out.println(password);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println("Your password is: " + password);
    }
}
