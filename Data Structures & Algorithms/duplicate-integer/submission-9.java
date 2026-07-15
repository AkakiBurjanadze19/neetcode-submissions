class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            if (freq.get(key) > 1) {
                return true;
            }
        }

        return false;
    }
}