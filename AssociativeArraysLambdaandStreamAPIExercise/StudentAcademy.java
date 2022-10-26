package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Double> studentAcademy = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());
            if(studentAcademy.containsKey(name)){
                double currentGrade = studentAcademy.get(name);
                studentAcademy.put(name, (currentGrade + grade) / 2);
            } else {
                studentAcademy.put(name,grade);
            }
        }
        studentAcademy.entrySet().stream()
                .filter(s -> s.getValue() >= 4.50)
                .forEach(entry ->
                        System.out.printf("%s -> %.2f\n",entry.getKey(),entry.getValue()));
    }
}
