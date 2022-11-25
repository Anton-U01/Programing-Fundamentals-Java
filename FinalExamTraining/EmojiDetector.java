package FinalExamTraining;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String emojisRegex = "([:||\\*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern emojisPattern = Pattern.compile(emojisRegex);
        String digitsRegex = "[1-9]";
        Pattern digitsPattern = Pattern.compile(digitsRegex);
        String text = scan.nextLine();
        BigInteger coolThreshold = new BigInteger(String.valueOf(1));
        Matcher digitsMatcher = digitsPattern.matcher(text);
        while(digitsMatcher.find()){
            BigInteger digit = new BigInteger(digitsMatcher.group());
            coolThreshold = coolThreshold.multiply(digit);
        }
        Matcher emojisMatcher = emojisPattern.matcher(text);
        List <String> coolEmojis = new ArrayList<>();
        int countOfCool = 0;
        while (emojisMatcher.find()){
            countOfCool++;
            BigInteger coolnessOfEmoji = BigInteger.valueOf(0);
            String emoji = emojisMatcher.group("emoji");
            for(int i = 0; i < emoji.length(); i++){
                coolnessOfEmoji = coolnessOfEmoji.add(BigInteger.valueOf(emoji.charAt(i)));
            }
            int isCool = coolnessOfEmoji.compareTo(coolThreshold);
            if(isCool >= 0){
                coolEmojis.add(emojisMatcher.group());
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(countOfCool + " emojis found in the text. The cool ones are:");
        for (String emoji : coolEmojis) {
            System.out.println(emoji);
        }
    }
}
