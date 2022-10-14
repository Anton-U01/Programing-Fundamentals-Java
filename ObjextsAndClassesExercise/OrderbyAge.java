package ObjextsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderbyAge {
    static class Person{
        String name;
        String id;
        int age;
        Person(String name,String id,int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getInfo() {
            return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
        }
        int getAge(){
            return this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        String input = scan.nextLine();
        int personsCount = 0;
        while (!input.equals("End")){
            String[] data = input.split(" ");
            String name = data[0];
            String id = data[1];
            int age = Integer.parseInt(data[2]);
            persons.add(new Person(name,id,age));
            personsCount++;
            input = scan.nextLine();
        }
        persons.stream().sorted((p1,p2)->Integer.compare(p1.getAge(),p2.getAge()))
                .forEach(person -> System.out.println(person.getInfo()));
    }


}
