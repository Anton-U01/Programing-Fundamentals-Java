package ExamTraining;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double foodQ = Double.parseDouble(scan.nextLine()) * 1000;
        double hayQ = Double.parseDouble(scan.nextLine()) * 1000;
        double coverQ = Double.parseDouble(scan.nextLine()) * 1000;
        double guineasWeight = Double.parseDouble(scan.nextLine()) * 1000;
        boolean isFinished = false;
        for(int i = 1; i <= 30; i++){
            foodQ -= 300;
            if(i % 2 == 0){
                hayQ -= 0.05 * foodQ;
            }
            if(i % 3 == 0){
                coverQ -= guineasWeight / 3;
            }
            if(hayQ <= 0 || coverQ <= 0 || foodQ <= 0){
                isFinished = true;
                break;
            }
        }
        if(isFinished){
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",foodQ / 1000,hayQ / 1000,coverQ / 1000);
        }
    }
}
