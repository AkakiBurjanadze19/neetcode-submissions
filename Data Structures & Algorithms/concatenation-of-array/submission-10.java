class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] getConcatenation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int n = nums.length;

        int[] ans = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                ans[idx++] = num;
            }
        }

        return ans;
    }
}