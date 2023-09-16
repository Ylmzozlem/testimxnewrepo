package Question53;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListUnion {
    public static List<Integer> union(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);

        set1.addAll(set2);

        return new ArrayList<>(set1);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        List<Integer> result = union(list1, list2);
        System.out.println("Union: " + result);
    }
}
