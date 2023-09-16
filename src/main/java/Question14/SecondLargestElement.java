package Question14;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a second largest element.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int result = findSecondLargest(numbers);
        System.out.println("Second largest element in the array: " + result);
    }
}
