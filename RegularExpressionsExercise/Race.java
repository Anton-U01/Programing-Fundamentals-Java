package RegularExpressionsExercise;

import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> names = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String line = scan.nextLine();
        Map<String,Integer> players = new HashMap<>();
        String nameRegex = "[A-Za-z]+";
        String kmRegex = "[\\d+]";
        Pattern pattern1 = Pattern.compile(nameRegex);
        Pattern pattern2 = Pattern.compile(kmRegex);
        while (!line.equals("end of race")){
            Matcher nameMatcher = pattern1.matcher(line);
            StringBuilder name = new StringBuilder();
            while(nameMatcher.find()){
                name.append(nameMatcher.group());
            }
            String nameAsString = name.toString();
            if(names.contains(nameAsString)){
                int km = 0;
                Matcher kmMatcher = pattern2.matcher(line);
                while (kmMatcher.find()){
                    km += Integer.parseInt(kmMatcher.group());
                }
                if(players.containsKey(nameAsString)){
                    players.put(nameAsString,km + players.get(nameAsString));
                } else {
                    players.put(nameAsString,km);
                }
            }
            line = scan.nextLine();
        }
        List<String> sorted = players.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("1st place: " + sorted.get(0));
        System.out.println("2nd place: " + sorted.get(1));
        System.out.println("3rd place: " + sorted.get(2));
    }
}
