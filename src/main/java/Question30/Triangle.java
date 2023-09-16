package Question30;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.0, 5.0);
        System.out.println("Area: " + triangle.getArea());
    }
}
