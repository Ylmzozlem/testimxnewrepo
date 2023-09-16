package Question09;

public class SquareRoot {
    public static double calculateSquareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }

        double guess = num;
        double epsilon = 1e-6; // A small value for precision

        while (Math.abs(guess * guess - num) > epsilon) {
            guess = 0.5 * (guess + num / guess);
        }

        return guess;
    }

    public static void main(String[] args) {
        double number = 25.0;
        double result = calculateSquareRoot(number);
        System.out.println("Square root of " + number + " is approximately " + result);
    }
}
