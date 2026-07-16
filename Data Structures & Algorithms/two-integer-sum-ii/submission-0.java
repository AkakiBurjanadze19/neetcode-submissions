class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0, right = n - 1;

        while (left < right) {
            int cur = numbers[left] + numbers[right];
            if (cur == target) {
                return new int[]{left + 1, right + 1};
            } else if (cur < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{};
    }
}
