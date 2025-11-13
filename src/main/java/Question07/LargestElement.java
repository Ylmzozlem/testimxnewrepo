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
    public static int ozlemtest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int yusuftest(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    public static int ozlemtest2(int[] arr) {
        int largestq = arr[0];
        for (int numq : arr) {
            if (numq > largestq) {
                largestq = numq;
            }
        }
        return largestq;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 20, 15};
        int result = findLargest(numbers);
        System.out.println("Largest element in the array: " + result);
    }
}