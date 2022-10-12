package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students20 {

    static class Student{
        String firstName;
        String lastName;
        int age;
        String city;

        Student(String firstName,String lastName,int age,String city){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }
        String getInfo(){
            return this.firstName + " " + this.lastName + " is " + this.age + " years old";
        }
        String getFirstName(){
            return firstName;
        }
        String getLastName(){
            return lastName;
        }
        void setFirstName(String firstName){
            this.firstName = firstName;
        }
        void setLastName(String lastName){
            this.lastName = lastName;
        }
        void setAge(int age){
            this.age = age;
        }
        void setCity(String city){
            this.city = city;
        }
    }
    private static Student getStudent(List<Student> students, String firstName, String lastName){
        Student existingStudent = null;
        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }
    private static boolean isExisting(List<Student> students,String firstName,String lastName){
        for (Student student : students) {
            if(student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List <Student> students = new ArrayList<>();
        while (!input.equals("end")){
            String[] studentData = input.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String city = studentData[3];
            if(isExisting(students,firstName,lastName)){
                    Student student = getStudent(students,firstName,lastName);
                    student.setFirstName(firstName);
                    student.setLastName(lastName);
                    student.setAge(age);
                    student.setCity(city);
            } else {
                students.add(new Student(firstName,lastName,age,city));
            }
            input = scan.nextLine();
        }
        String city = scan.nextLine();
        for (Student student : students) {
            if(student.city.equals(city)){
                System.out.println(student.getInfo());
            }
        }
    }
}
