package Question16;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeated(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }

        throw new RuntimeException("No non-repeated character found");
    }

    public static void main(String[] args) {
        String input = "programming";
        char result = findFirstNonRepeated(input);
        System.out.println("First non-repeated character: " + result);
    }
}
