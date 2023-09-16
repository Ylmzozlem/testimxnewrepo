package Question34;

public class Email {
    private String subject;
    private String sender;
    private String recipient;

    public Email(String subject, String sender, String recipient) {
        this.subject = subject;
        this.sender = sender;
        this.recipient = recipient;
    }

    public void sendEmail() {
        System.out.println("Email sent from: " + sender);
        System.out.println("Email sent to: " + recipient);
        System.out.println("Subject: " + subject);
        System.out.println("Message: (Email content here)");
    }

    public static void main(String[] args) {
        Email email = new Email("Hello", "alice@example.com", "bob@example.com");
        email.sendEmail();
    }
}
