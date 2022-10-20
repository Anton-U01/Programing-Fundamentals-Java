package ExamTraining;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int peopleWaiting = Integer.parseInt(scan.nextLine());
        int[] wagons = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean peoplesLeft = true;
        for (int i = 0; i < wagons.length; i++){
            while(wagons[i] != 4 || !peoplesLeft){
                int peopleInThisWagon = 4 - wagons[i];
                if(peopleWaiting < peopleInThisWagon){
                    peopleInThisWagon = peopleWaiting;
                    peopleWaiting -= peopleInThisWagon;
                    wagons[i] += peopleInThisWagon;
                    peoplesLeft = false;
                    break;
                }
                if(peopleInThisWagon < peopleWaiting){
                    peopleWaiting -= peopleInThisWagon;
                    wagons[i] += peopleInThisWagon;
                    peoplesLeft = true;
                } else {
                    peopleInThisWagon += peopleWaiting;
                    peopleWaiting = 0;
                    peoplesLeft = false;
                }
            }
        }
        if(peoplesLeft){
            System.out.printf("There isn't enough space! %d people in a queue!\n",peopleWaiting);
        } else {
            System.out.println("The lift has empty spots!");
        }
        for (int wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
