class Solution {
    // Time Complexity: O(n log n)
    // Space Complexity: O(1)
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[]{};
        }

        heapSort(nums);

        return nums;
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void heapify(int[] arr, int i, int size) {
        int left = left(i);
        int right = right(i);
        int largest = i;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, size);
        }
    }

    private void buildHeap(int[] arr) {
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, i, size);
        }
    }

    private void heapSort(int[] arr) {
        buildHeap(arr);

        int size = arr.length;
        for (int i = size - 1; i > 0; i--) {
            swap(arr, 0, i);
            size = size - 1;
            heapify(arr, 0, size);
        }
    }
}