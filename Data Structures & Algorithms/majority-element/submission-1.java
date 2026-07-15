class Solution {
    /* Boyer-Moore Voting Algorithm */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int majorityElement(int[] nums) {
        int n = nums.length;

        int count1 = 0;
        int el = -1;
        for (int num : nums) {
            if (count1 == 0) {
                count1 = 1;
                el = num;
            } else if (num == el) {
                count1++;
            } else {
                count1--;
            }
        }

        int count2 = 0;
        for (int num : nums) {
            if (num == el) {
                count2++;
            }
        }

        if (count2 > n / 2) {
            return el;
        }

        return -1;
    }
}