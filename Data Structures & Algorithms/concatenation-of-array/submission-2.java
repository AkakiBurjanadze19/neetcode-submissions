class Solution {
    public int[] getConcatenation(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int[] res = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
            res[i + nums.length] = nums[i];
        }

        return res;
    }
}