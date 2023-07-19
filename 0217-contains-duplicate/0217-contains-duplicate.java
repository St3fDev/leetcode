class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if (i+1 < nums.length && nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

/*
public boolean containsDuplicate(int[] nums) {
    HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
*/