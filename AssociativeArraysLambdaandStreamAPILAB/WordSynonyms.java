package AssociativeArraysLambdaandStreamAPILAB;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> synonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++){
            String key = scan.nextLine();
            String value = scan.nextLine();
            if(synonyms.containsKey(key)){
                synonyms.get(key).add(value);
            } else {
                List <String> values = new ArrayList<>();
                values.add(value);
                synonyms.put(key,values);
            }
        }
        for (Map.Entry<String, List<String>> stringListEntry : synonyms.entrySet()) {
            System.out.println(stringListEntry.getKey() + " - " + stringListEntry.getValue().toString().replaceAll("[\\[\\]]", ""));
        }
    }
}
