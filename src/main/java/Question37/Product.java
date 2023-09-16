package Question37;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            double discountAmount = (discountPercentage / 100) * price;
            price -= discountAmount;
            System.out.println("Discount of $" + discountAmount + " applied to " + name);
        } else {
            System.out.println("Invalid discount percentage");
        }
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1000.0);
        product.applyDiscount(10.0);
        product.displayInfo();
    }
}
