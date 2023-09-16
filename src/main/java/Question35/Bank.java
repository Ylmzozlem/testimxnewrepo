package Question35;

public class Bank {
    private String name;
    private String location;

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Bank Name: " + name);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank", "New York");
        bank.displayInfo();
    }
}
