class Solution {
    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int res = 0;
        for (int num : nums) {
            int streak = 0;
            int curr = num;
            while (set.contains(curr)) {
                streak++;
                curr += 1;
            }
            res = Math.max(streak, res);
        }

        return res;
    }
}
