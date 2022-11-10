package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split("\\\\");
        String[] file = data[data.length - 1].split("\\.");

        System.out.println("File name: " + file[0]);
        System.out.println("File extension: " + file[1]);
    }
}
