package ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] words = input.split(" ");
        Random random = new Random();
        for (int i = 0; i < words.length;i++){
            int indexForSwap = random.nextInt(words.length);
            String wordForChange = words[indexForSwap];
            words[indexForSwap] = words[i];
            words[i] = wordForChange;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
