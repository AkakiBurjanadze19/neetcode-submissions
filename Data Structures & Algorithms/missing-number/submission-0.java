class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int currSum = 0;
        for (int num : nums) {
            currSum += num;
        }
        
        return expectedSum - currSum;
    }
}