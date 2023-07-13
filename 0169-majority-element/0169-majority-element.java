class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
                int valore = map.get(nums[i]);
                valore++;
                map.put(nums[i],valore);
            } else {
                map.put(nums[i],1);
            }
        }
        Integer chiaveMassima = null;
        int valoreMassimo = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > valoreMassimo) {
                chiaveMassima = entry.getKey();
                valoreMassimo = entry.getValue();
            }
        } 
        return chiaveMassima;
    }
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
*/
