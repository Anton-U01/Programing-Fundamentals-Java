package TextProcessingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = scan.nextLine().split(" ");
        List<String> concat = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length(); j++){
                concat.add(array[i]);
            }
        }
        for (String s : concat) {
            System.out.print(s);
        }
    }
}
