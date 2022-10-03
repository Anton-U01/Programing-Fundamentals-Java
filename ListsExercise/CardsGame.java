package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> handA = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> handB = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (handA.size() != 0 && handB.size() != 0) {
            if (handA.get(0) > handB.get(0)) {
                handA.add(handA.get(0));
                handA.remove(0);
                handA.add(handB.get(0));
                handB.remove(0);
            } else if (handB.get(0) > handA.get(0)) {
                handB.add(handB.get(0));
                handB.remove(0);
                handB.add(handA.get(0));
                handA.remove(0);
            } else {
                handA.remove(0);
                handB.remove(0);
            }
        }
        if(handA.size() > handB.size()) {
            int sum = 0;
            for (Integer playerACard : handA) {
                sum += playerACard;
            }
            System.out.print("First player wins!" + " Sum: "+ sum);
        } else {
            int sum = 0;
            for (Integer playerBCard : handB) {
                sum += playerBCard;
            }
            System.out.print("Second player wins!" + " Sum: "+ sum);
        }
    }
}