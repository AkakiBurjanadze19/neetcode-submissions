class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(26)
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            freq1.put(sChar, freq1.getOrDefault(sChar, 0) + 1);
            freq2.put(tChar, freq2.getOrDefault(tChar, 0) + 1);
        }

        return freq1.equals(freq2);
    }
}