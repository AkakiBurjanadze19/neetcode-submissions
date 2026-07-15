class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                int firstIdx = Math.min(i, map.get(diff));
                int secondIdx = Math.max(i, map.get(diff));
                return new int[]{firstIdx, secondIdx};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
