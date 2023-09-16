package Question59;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElementFrequencyInArrayList {
    public static int findFrequency(List<Integer> list, int element) {
        return Collections.frequency(list, element);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        int target = 2;
        int frequency = findFrequency(numbers, target);
        System.out.println("Frequency of " + target + ": " + frequency);
    }
}
