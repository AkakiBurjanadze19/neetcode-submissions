class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] getConcatenation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int idx = 0;
        int[] res = new int[2 * nums.length];
        
        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                res[idx++] = num;
            }
        }

        return res;
    }
}