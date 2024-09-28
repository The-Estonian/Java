public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        s = s.toLowerCase();
        if (palindrome(s)) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String newString = "";
            for (int j = 0; j < s.length(); j++) {
                if (j != i) {
                    newString += s.charAt(j);
                }
            }
            if (palindrome(newString)) {
                return true;
            }
        }
        return false;
    }

    public static boolean palindrome(String pal) {
        String newString = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            newString += pal.charAt(i);
        }
        if (pal.equals(newString)) {
            return true;
        }
        return false;
    }
}
