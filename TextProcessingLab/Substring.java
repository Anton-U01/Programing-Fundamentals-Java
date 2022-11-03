package TextProcessingLab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        String line = scan.nextLine();
        int index = line.indexOf(key);
        while(index != -1){
            line = line.replace(key,"");
            index = line.indexOf(key);
        }
        System.out.println(line);
    }
}
