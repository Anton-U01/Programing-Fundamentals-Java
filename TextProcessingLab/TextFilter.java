package TextProcessingLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> bannedWords = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());
        String text = scan.nextLine();
        for (String word : bannedWords) {
            int index = text.indexOf(word);
            String replacement = repeatStr("*",word.length());
            text = text.replace(word,replacement);
        }
        System.out.println(text);
    }

    private static String repeatStr(String s, int length) {
        StringBuilder replacement = new StringBuilder();
        for(int i = 0; i < length; i++){
            replacement.append(s);
        }
        return replacement.toString();
    }
}
