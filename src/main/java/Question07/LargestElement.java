package Question07;

public class LargestElement {
    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int result = findLargest(numbers);
        System.out.println("Largest element in the array: " + result);
    }
}