class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public int missingNumber(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) return i;
        }
        return nums.length;
    }
}