package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String,List<String>> courses = new LinkedHashMap<>();
        while(!input.equals("end")){
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];
            if(courses.containsKey(course)){
                courses.get(course).add(name);
            } else {
                courses.put(course,new ArrayList<String>());
                courses.get(course).add(name);
            }
            input = scan.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            List<String> names = entry.getValue();
            for (String name : names) {
                System.out.println("-- " + name);
            }
        }
    }
}
