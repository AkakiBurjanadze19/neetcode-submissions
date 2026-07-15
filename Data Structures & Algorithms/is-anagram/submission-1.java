class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        // if lengths differ, they are not valid anagrams.
        if (s.length() != t.length()) {
            return false;
        }

        // for storing character frequencies from both strings
        Map<Character, Integer> count1 = new HashMap<>();
        Map<Character, Integer> count2 = new HashMap<>();

        // count character frequencies in both strings
        for (Character c : s.toCharArray()) {
            count1.put(c, count1.getOrDefault(c, 0) + 1);
        }

        for (Character c : t.toCharArray()) {
            count2.put(c, count2.getOrDefault(c, 0) + 1);
        }

        // compare character frequencies
        for (Character c : count1.keySet()) {
            if (!count1.getOrDefault(c, 0).equals(count2.getOrDefault(c, 0))) {
                return false;
            }
        }

        return true;
    }
}
