package AssociativeArraysLambdaandStreamAPIExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, List<String>> users = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String id = data[1];
            if (users.containsKey(company)) {
                if (!users.get(company).contains(id)) {
                    users.get(company).add(id);
                }
            } else {
                users.put(company, new ArrayList<>());
                users.get(company).add(id);
            }
            input = scan.nextLine();
        }
        users.entrySet().stream()
                .forEach(stringListEntry -> {
                            System.out.println(stringListEntry.getKey());
                            stringListEntry.getValue()
                                    .forEach(s -> System.out.println("-- " + s));
                        }
                );
    }
}

