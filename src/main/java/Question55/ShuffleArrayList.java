package Question55;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArrayList {
    public static void shuffle(List<Integer> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original List: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
    }
}
