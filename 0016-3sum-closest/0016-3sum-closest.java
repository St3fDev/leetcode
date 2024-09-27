class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int closestNumber = Integer.MAX_VALUE;
        Arrays.sort(nums);
        HashMap<Integer,Integer> result = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int distance = (sum > target) ? sum - target : target - sum; 
                result.put(distance, sum);
                if (sum == target) return sum;
                else if(distance < closestNumber) closestNumber = distance;

                if (sum < target) left++;
                else right--;
            }
        }
        return result.get(closestNumber);
    }
}