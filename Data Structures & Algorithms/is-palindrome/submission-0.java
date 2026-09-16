class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                cleaned += Character.toLowerCase(ch);
            }
        }

        String reverse = "";

    for (int i = cleaned.length() - 1; i >= 0; i--) {
        reverse += cleaned.charAt(i);
    }

    return reverse.equals(cleaned);
    }
}
