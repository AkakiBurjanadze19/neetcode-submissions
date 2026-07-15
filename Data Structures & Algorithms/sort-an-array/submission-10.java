class Solution {
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        mergeSort(nums, 0, n - 1);

        return nums;
    }

    private void merge(int[] nums, int low, int mid, int high) {
        int n = nums.length;

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }
}