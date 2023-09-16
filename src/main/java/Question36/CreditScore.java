package Question36;

public class CreditScore {
    private int score;

    public CreditScore(int score) {
        this.score = score;
    }

    public boolean isGood() {
        return score >= 700;
    }

    public static void main(String[] args) {
        CreditScore score1 = new CreditScore(750);
        CreditScore score2 = new CreditScore(650);

        System.out.println("Credit Score 1 is good: " + score1.isGood());
        System.out.println("Credit Score 2 is good: " + score2.isGood());
    }
}
