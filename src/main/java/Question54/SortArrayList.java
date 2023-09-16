package Question54;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void sortAscending(List<Integer> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("Original List: " + numbers);
        sortAscending(numbers);
        System.out.println("Sorted List (ascending): " + numbers);
    }
}
