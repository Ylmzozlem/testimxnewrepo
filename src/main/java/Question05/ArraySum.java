package Question05;

public class ArraySum {
    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sum(numbers);
        System.out.println("Sum of array elements: " + result);
    }
}