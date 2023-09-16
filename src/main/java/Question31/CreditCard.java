package Question31;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private double creditLimit;
    private double balance;

    public CreditCard(String cardNumber, String cardHolderName, double creditLimit) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    public void makePurchase(double amount) {
        if (amount > 0 && balance + amount <= creditLimit) {
            balance += amount;
            System.out.println("Purchase of $" + amount + " made successfully");
        } else {
            System.out.println("Invalid purchase amount or credit limit exceeded");
        }
    }

    public void displayInfo() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Credit Limit: $" + creditLimit);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        CreditCard card = new CreditCard("1234-5678-9012-3456", "Alice Smith", 5000.0);
        card.makePurchase(1000.0);
        card.makePurchase(4000.0);
        card.displayInfo();
    }
}
