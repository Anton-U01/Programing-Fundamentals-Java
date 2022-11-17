package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "[>]{2}(?<item>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
        String line = scan.nextLine();
        Matcher matcher;
        double total = 0.0;
        List<String> items = new ArrayList<>();
        while (!line.equals("Purchase")) {
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                String item = matcher.group("item");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                items.add(item);
                total += quantity * price;
            }
            line = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.printf("Total money spend: %.2f",total);
    }
}
