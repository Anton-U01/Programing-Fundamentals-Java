package ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        String[] text1AsArray = text1.split(" ");
        String[] text2AsArray = text2.split(" ");
        List<Integer> numbersA = new ArrayList<>();
        List<Integer> numbersB = new ArrayList<>();
        for (String s : text1AsArray) {
            numbersA.add(Integer.parseInt(s));
        }
        for (String s : text2AsArray) {
            numbersB.add(Integer.parseInt(s));
        }
        int indexA = 0;
        int indexB = 0;
        List<Integer> resultList = new ArrayList<>();
        while (indexA < numbersA.size() & indexB < numbersB.size()){
            resultList.add(numbersA.get(indexA));
            indexA++;
            resultList.add(numbersB.get(indexB));
            indexB++;
        }
        if (numbersA.size() > numbersB.size()){
            resultList.addAll(getRestElements(numbersA,indexB));
        } else {
            resultList.addAll(getRestElements(numbersB,indexA));
        }
        for (Integer e : resultList) {
            System.out.print(e + " ");
        }
    }

    private static List<Integer> getRestElements(List<Integer> numbersA, int indexB) {
        List<Integer> restElements = new ArrayList<>();
        for (int i = indexB; i < numbersA.size(); i++){
            restElements.add(numbersA.get(i));
        }
        return restElements;
    }
}
