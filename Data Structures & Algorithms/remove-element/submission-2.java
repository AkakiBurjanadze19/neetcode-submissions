class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        int start = 0;
        for (int current = 0; current < n; current++) {
            if (nums[current] != val) {
                nums[start] = nums[current];
                start++;
            }
        }

        return start;
    }
}