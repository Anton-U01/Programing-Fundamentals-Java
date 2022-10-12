package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students {
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
            students.add(new Student(firstName,lastName,age,city));
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
