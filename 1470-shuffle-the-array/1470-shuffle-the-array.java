class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        int m = 0;
        int l = 0;
        for (int i = 0; i < 2*n; i++) {
            if (i % 2 == 0){
                result[i] = nums[m];
                m++;
            }
            else {
                result[i] = nums[l+n];
                l++;
            }
        }
        return result;
    }
}