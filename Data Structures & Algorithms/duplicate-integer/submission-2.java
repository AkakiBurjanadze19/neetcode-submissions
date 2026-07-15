class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        return set.size() < nums.length;
    }
}