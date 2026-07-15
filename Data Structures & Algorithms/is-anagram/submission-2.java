class Solution {
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return false;
        }

        if (s.length() != t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        for (int i = 0; i < sChars.length; i++) {
            if (sChars[i] != tChars[i]) {
                return false;
            }
        }

        return true;
    }
}
