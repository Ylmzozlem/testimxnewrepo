package Question41;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChars {
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int startIndex = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= startIndex) {
                startIndex = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, endIndex);
            maxLen = Math.max(maxLen, endIndex - startIndex + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest substring length without repeating characters: " + result);
    }
}
