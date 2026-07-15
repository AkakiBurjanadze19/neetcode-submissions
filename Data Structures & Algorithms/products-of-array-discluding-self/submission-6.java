class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] pref = new int[n];
        int[] suff = new int[n];
        int[] res = new int[n];

        pref[0] = 1; // nothing to the left of index 0
        suff[n - 1] = 1; // nothing to the right of last index

        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }

        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }

        return res;
    }
}  
