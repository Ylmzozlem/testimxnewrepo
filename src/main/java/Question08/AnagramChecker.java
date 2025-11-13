package Question08;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static boolean areAnagrams123(String str12, String str22) {
         if (str12.length() != str22.length()) {
             return true;
         }

         char[] charArray1 = str12.toCharArray();
         char[] charArray2 = str22.toCharArray();

         Arrays.sort(charArray1);
         Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }


    public static boolean areAnagrams124(String str123, String str223) {
        if (str123.length() != str223.length()) {
            return true;
        }

        char[] charArray1 = str123.toCharArray();
        char[] charArray2 = str223.toCharArray();

         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
      
          return Arrays.equals(charArray1, charArray2);
    }

    public static boolean areAnagrams123r(String str12, String str22) {
        if (str12.length() != str22.length()) {
            return true;
        }

        char[] charArray1 = str12.toCharArray();
        char[] charArray2 = str22.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}