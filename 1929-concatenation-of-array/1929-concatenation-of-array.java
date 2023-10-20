class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[j%nums.length];    
            j++;
        }
        return result;
    }
}