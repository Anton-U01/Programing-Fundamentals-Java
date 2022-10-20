package ExamTraining;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int efficient1  = Integer.parseInt(scan.nextLine());
        int efficient2  = Integer.parseInt(scan.nextLine());
        int efficient3  = Integer.parseInt(scan.nextLine());
        int studentsCount = Integer.parseInt(scan.nextLine());
        int totalStudentsPerHour = efficient1 + efficient2 + efficient3;
        int hourCounter = 0;
        while(studentsCount > 0){
           if(totalStudentsPerHour < studentsCount){
               hourCounter++;
               studentsCount -= totalStudentsPerHour;
           } else {
               hourCounter++;
               studentsCount = 0;
           }
           if (hourCounter % 4 == 0){
               hourCounter++;
           }
       }
        System.out.println("Time needed: " + hourCounter + "h.");
    }
}