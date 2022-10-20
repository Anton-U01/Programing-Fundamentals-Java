package ExamTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> numbers = (Arrays.stream(scan.nextLine().split(" "))
                .collect(Collectors.toList()));
        String input = scan.nextLine();
        int movesCount = 1;
        boolean isReady = false;
        while(!input.equals("end")){
            String[] data = input.split(" ");
            int index1 = Integer.parseInt(data[0]);
            int index2 = Integer.parseInt(data[1]);
            int middleIndex = numbers.size() / 2;
            if(index1 == index2 || index1 < 0 || index2 < 0 || index2 > numbers.size() || index1 > numbers.size()){
                String newElement = "-" + movesCount + "a";
                numbers.add(middleIndex,newElement);
                numbers.add(middleIndex,newElement);
                System.out.println("Invalid input! Adding additional elements to the board\n");
                movesCount++;
            }else if(numbers.get(index1).equals(numbers.get(index2))){
                System.out.printf("Congrats! You have found matching elements - %s!\n",numbers.get(index1));
                if(index1 > index2){
                    numbers.remove(index1);
                    numbers.remove(index2);
                } else {
                    numbers.remove(index2);
                    numbers.remove(index1);
                }
                if (numbers.size() == 0){
                    isReady = true;
                    break;
                }
                movesCount++;
            } else {
                System.out.println("Try again!");
                movesCount++;
            }

            input = scan.nextLine();
        }
        if(isReady){
            System.out.println("You have won in " + movesCount + " turns!");
        } else {
            System.out.println("Sorry you lose :(");
            for (String number : numbers) {
                System.out.print((number + " "));
            }
        }
    }
}
