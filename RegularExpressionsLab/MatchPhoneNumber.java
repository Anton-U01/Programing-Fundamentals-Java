package RegularExpressionsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "\\+359( ||\\-)+2\\1+\\d{3}\\1+\\d{4}\\b";
        String line = scan.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        List <String> numbers = new ArrayList<String>();
        while(matcher.find()){
            numbers.add(matcher.group());
        }
        String result = String.join(", ",numbers);
        System.out.println(result);
    }
}
