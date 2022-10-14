package ObjextsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student{
        String firstName;
        String lastName;
        double grade;
        Student(String firstName,String lastName,double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }
        double getGrade(){
            return this.grade;
        }
        String getInfo(){
            return this.firstName + " " + this.lastName + ": " + String.format("%.2f",this.grade);
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Student> students = new ArrayList<>(n);
        for (int i = 0; i < n; i++){
            String[] input = scan.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            students.add(new Student(firstName,lastName,grade));
        }
        for(int i = 0; i < n; i++){
            int index = findMax(students);
            System.out.println(students.get(index).getInfo());
            removeMaxFromList(students,index);
        }
    }

    private static void removeMaxFromList(List<Student> students,int index) {
        students.remove(index);
    }

    private static int findMax(List<Student> students) {
        double maxGrade = students.get(0).getGrade();
        int indexOfBest = 0;
        for(int i = 1; i < students.size(); i++){
            if (students.get(i).getGrade() > maxGrade){
                maxGrade = students.get(i).getGrade();
                indexOfBest = i;
            }
        }
        return indexOfBest;
    }
}
