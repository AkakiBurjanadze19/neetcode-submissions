class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean isPalindrome(String s) {
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                res.append(Character.toLowerCase(c));
            }
        }

        return res.toString().equals(res.reverse().toString());
    }
}
