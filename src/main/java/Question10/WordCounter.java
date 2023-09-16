package Question10;

public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String text = "This is a sample sentence.";
        int wordCount = countWords(text);
        System.out.println("Number of words in the text: " + wordCount);
    }
}
