package RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String reg = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String line = scan.nextLine();
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(line);
        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }
    }
}
