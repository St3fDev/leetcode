class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> s = new HashSet<>();
        List<List<Integer>> result = new ArrayList();
        int target = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                if (nums[i] + nums[j] + nums[k] == 0) {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if (nums[i] + nums[j] + nums[k] < target) j++;
                else k--;
            }
        }
        result.addAll(s);
        return result;
    }
}