class Solution {
    private static final Random rand = new Random();
    private static final int INSERTION_SORT_CUTOFF = 10;

    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        sort(nums);

        return nums;
    }

    public void sort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }

    private void quickSortHelper(int[] arr, int left, int right) {
        if (right - left <= INSERTION_SORT_CUTOFF) {
            insertionSort(arr, left, right);
            return;
        }

        if (left < right) {
            int[] pivots = partition(arr, left, right);

            quickSortHelper(arr, left, pivots[0] - 1);
            quickSortHelper(arr, pivots[1] + 1, right);
        }
    }

    private int[] partition(int[] arr, int left, int right) {
        int randomIndex = randomInt(left, right);
        int pivot = arr[randomIndex];

        int i = left;
        int j = left;
        int k = right;

        while (j <= k) {
            if (arr[j] < pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[j] > pivot) {
                swap(arr, j, k);
                k--;
            } else {
                j++;
            }
        }

        return new int[]{i, k};
    }

    private static void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private int randomInt(int left, int right) {
        return left + rand.nextInt(right - left + 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}