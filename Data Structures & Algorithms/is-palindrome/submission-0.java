class Solution {
    public boolean isPalindrome(String s) {
         StringBuilder cleaned = new StringBuilder();
        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleaned.append(ch);
            }
        }

        String original = cleaned.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
