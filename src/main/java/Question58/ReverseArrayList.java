package Question58;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);
        reverse(numbers);
        System.out.println("Reversed List: " + numbers);
    }
}
