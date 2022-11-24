package FinalExamTraining;

import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String key = scan.nextLine();
        String line = scan.nextLine();
        while (!line.equals("Generate")){
            String[] data = line.split(">>>");
            String command = data[0];
            int beginIndex = 0;
            int endIndex = 0;
            String substring = data[1];
            switch (command){
                case "Contains":
                    substring = data[1];
                    if(key.contains(substring)){
                        System.out.println(key + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String type = data[1];
                    beginIndex = Integer.parseInt(data[2]);
                    endIndex = Integer.parseInt(data[3]);
                    if(type.equals("Upper")){
                        substring = key.substring(beginIndex,endIndex);
                        key = key.replace(substring,substring.toUpperCase());
                        System.out.println(key);
                    } else {
                        substring = key.substring(beginIndex,endIndex);
                        key = key.replace(substring,substring.toLowerCase());
                        System.out.println(key);
                    }
                    break;
                case "Slice":
                    beginIndex = Integer.parseInt(data[1]);
                    endIndex = Integer.parseInt(data[2]);
                    substring = key.substring(beginIndex,endIndex);
                    key = key.replace(substring,"");
                    System.out.println(key);
                    break;
            }

            line = scan.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
