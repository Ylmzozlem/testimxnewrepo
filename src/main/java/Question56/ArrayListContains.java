package Question56;

import java.util.ArrayList;
import java.util.List;

public class ArrayListContains {
    public static boolean containsElement(List<Integer> list, int element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int target = 3;
        boolean contains = containsElement(numbers, target);
        System.out.println("List contains " + target + ": " + contains);
    }
}
