package Question51;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromArrayList {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("Original List: " + numbers);
        removeDuplicates(numbers);
        System.out.println("List after removing duplicates: " + numbers);
    }
}
