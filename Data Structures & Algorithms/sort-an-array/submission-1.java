class Solution {
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        int n = nums.length;

        mergeSort(nums, 0, n - 1);

        return nums;
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = nums[left + i];
        }

        for (int j = 0; j < rightSize; j++) {
            rightArr[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArr[i] < rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftSize) {
            nums[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            nums[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
}