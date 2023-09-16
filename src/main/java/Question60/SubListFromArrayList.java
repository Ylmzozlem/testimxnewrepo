package Question60;

import java.util.ArrayList;
import java.util.List;

public class SubListFromArrayList {
    public static List<Integer> createSubList(List<Integer> list, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > list.size() || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        return list.subList(startIndex, endIndex);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int startIndex = 1;
        int endIndex = 4;

        List<Integer> subList = createSubList(numbers, startIndex, endIndex);
        System.out.println("Sublist: " + subList);
    }
}
