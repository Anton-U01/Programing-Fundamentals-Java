package BasicSyntaxConditionalStatementsandLoops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scan.nextLine());
        String groupType = scan.nextLine();
        String day = scan.nextLine();
        double price = 0.0;
        switch (groupType){
            case "Students": if (day.equals("Friday")){
                price = peopleCount * 8.45;
            }else if (day.equals("Saturday")){
                price = peopleCount * 9.80;
            } else if (day.equals("Sunday")){
                price = peopleCount * 10.46;
            }
            if (peopleCount >= 30){
                price -= 0.15 * price;
            }
            break;
            case "Business": if (day.equals("Friday")){
                price = peopleCount * 10.90;
                if (peopleCount >= 100){
                    price -= 10 * 10.90;
                }
            }else if (day.equals("Saturday")){
                price = peopleCount * 15.60;
                if (peopleCount >= 100){
                    price -= 10 * 15.60;
                }
            } else if (day.equals("Sunday")){
                price = peopleCount * 16;
                if (peopleCount >= 100){
                    price -= 10 * 16;
                }
            }
            break;
            case "Regular": if (day.equals("Friday")){
                price = peopleCount * 15;
            }else if (day.equals("Saturday")){
                price = peopleCount * 20;
            } else if (day.equals("Sunday")){
                price = peopleCount * 22.50;
            }
                if (peopleCount >= 10 && peopleCount <= 20){
                    price -= 0.05 * price;
                }
                break;
        }
        System.out.printf("Total price : %.2f", price);
    }
}
