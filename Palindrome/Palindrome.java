public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        StringBuilder returnString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            returnString.append(s.charAt(i));
        }
        return s.equals(returnString.toString());
    }
}