package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<item>\\w+)>[^|$.]*?\\|(?<count>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);
        double total = 0.0;
        List <String> names = new ArrayList<>();
        List <String> items = new ArrayList<>();
        List <Double> prices = new ArrayList<>();
        while(!line.equals("end of shift")){
            Matcher matcher = pattern.matcher(line);
            StringBuilder sb = new StringBuilder();
            while (matcher.find()){
                names.add(matcher.group("name"));
                items.add(matcher.group("item"));
                prices.add(Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price")));
                total += Integer.parseInt(matcher.group("count")) * Double.parseDouble(matcher.group("price"));
            }
            line = scan.nextLine();
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + ": " + items.get(i) + " - " + String.format("%.2f",prices.get(i)));
        }
        System.out.println("Total income: " + String.format("%.2f",total));
    }
}
