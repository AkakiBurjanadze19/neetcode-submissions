class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();
        for (int key : freq.keySet()) {
            if (freq.get(key) > n / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
}