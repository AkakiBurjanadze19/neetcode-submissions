class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int val : count.values()) {
            if (val > 1) {
                return true;
            }
        }

        return false;
    }
}