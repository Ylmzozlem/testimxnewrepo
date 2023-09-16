package Question57;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxElementInArrayList {
    public static int findMax(List<Integer> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        int max = findMax(numbers);
        System.out.println("Maximum element: " + max);
    }
}
