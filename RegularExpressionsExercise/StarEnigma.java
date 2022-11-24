package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int attCount = 0;
        int desCount = 0;
        List <String> attackedPlanets = new ArrayList<>();
        List <String> destroyedPlanets = new ArrayList<>();
        for(int i = 0; i < n; i++){
            StringBuilder line = new StringBuilder(scan.nextLine());
            int key = 0;
            for(int j = 0; j < line.length(); j++){
                char c = Character.toLowerCase(line.charAt(j));
                if(c == 's' || c == 't' || c == 'a' || c == 'r'){
                    key++;
                }
            }
            for(int j = 0; j < line.length(); j++){
                line.setCharAt(j, (char) (line.charAt(j) - key));
            }
            String regex = "@(?<planet>[A-Z][a-z]+)[^@\\-:!>)]*?:(?<population>\\d+)[^@\\-:!>)]*?!(?<type>A||D)!->(?<count>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                if(matcher.group("type").equals("A")){
                    attCount++;
                    attackedPlanets.add(matcher.group("planet"));
                } else if (matcher.group("type").equals("D")){
                    desCount++;
                    destroyedPlanets.add(matcher.group("planet"));
                }
            }
        }
        System.out.println("Attacked planets: " + attCount);
        attackedPlanets.stream().sorted().forEach(s -> System.out.println("-> " + s));
        System.out.println("Destroyed planets: " + desCount);
        destroyedPlanets.stream().sorted().forEach(s -> System.out.println("-> " + s));
    }
}
