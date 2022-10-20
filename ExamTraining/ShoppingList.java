package ExamTraining;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = (Arrays.stream(scan.nextLine().split("!"))
                .collect(Collectors.toList()));
        String input = scan.nextLine();
        while(!input.equals("Go Shopping!")){
            String[] data = input.split(" ");
            String type = data[0];
            if(data.length <= 2) {
                String item = data[1];
                switch (type) {
                    case "Urgent":
                        if (list.contains(item)) {
                            break;
                        } else {
                            list.add(0, item);
                        }
                        break;
                    case "Unnecessary":

                        if (list.contains(item)) {
                            list.remove(item);
                        }
                        break;
                    case "Rearrange":
                        if (list.contains(item)) {
                            list.remove(item);
                            list.add(item);
                        }
                        break;
                }
            }
                int index = -1;
                if(type.equals("Correct")){
                    if(list.contains(data[1])){
                        index = list.indexOf(data[1]);
                        list.set(index,data[2]);
                    }
                }
            input = scan.nextLine();
        }
        String separator = "";
        for (String e : list) {
            System.out.print(separator + e);
            separator = ", ";
        }
    }
}
