package ObjextsAndClassesExercise;

import ObjectsAndClassesLab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {
    static class Person{
        String name;
        int age;
        Person(String name,int age){
            this.name = name;
            this.age = age;
        }
        public int getAge(){
            return this.age;
        }
        String getInfo(){
            return this.name + " - " + this.age;
        }
        
    }
    static boolean isPersonOver30(Person person){
        if(person.getAge() > 30){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        List<Person> persons = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            String[] data = scan.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            persons.add(new Person(name,age));
            if(isPersonOver30(persons.get(i))){
                System.out.println(persons.get(i).getInfo());
            }
        }
    }
}
