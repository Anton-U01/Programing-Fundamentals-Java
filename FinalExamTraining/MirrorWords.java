package FinalExamTraining;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("(([@||#])(?<word1>[A-Za-z]{3,})(\\2))(([@||#])(?<word2>[A-Za-z]{3,})(\\2))");
        List<String> words = new ArrayList<>();
        Matcher matcher = pattern.matcher(text);
        int pairsCount = 0;
        while (matcher.find()){
            words.add(matcher.group("word1"));
            words.add(matcher.group("word2"));
            pairsCount++;
        }
        if(pairsCount == 0){
            System.out.println("No word pairs found!");
        } else {
            System.out.println(pairsCount + " word pairs found!");
        }
        String word = "";
        StringBuilder secondWord = new StringBuilder();
        Map<String, String> mirrorWords = new LinkedHashMap<>();
        for(int i = 0; i < words.size(); i++){
            if(i % 2 == 0){
                word = words.get(i);
            }
            if(i % 2 != 0){
                secondWord = new StringBuilder(words.get(i));
                String reverse = String.valueOf(secondWord.reverse());
                if(word.equals(reverse)){
                    mirrorWords.put(word,words.get(i));
                }
            }
        }
        if(mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");
            for (Map.Entry<String, String> entry : mirrorWords.entrySet()) {
                System.out.print(entry.getKey() + " <=> " + entry.getValue() + ", ");
            }
        }
    }
}
