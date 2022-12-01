package FinalExamTraining;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);
        int n = Integer.parseInt(scan.nextLine());
        Matcher matcher = null;
        for(int i = 0; i < n; i++){
            String line = scan.nextLine();
            matcher = pattern.matcher(line);
            StringBuilder sb = new StringBuilder();
            if(matcher.find()){
                for(int j = 0; j < line.length();j++){
                    char symbol = line.charAt(j);
                    if(Character.isDigit(symbol)){
                        sb.append(symbol);
                    }
                }
                if(sb.length() == 0){
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
