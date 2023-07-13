class Solution {
    public int singleNumber(int[] nums) {
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
        Integer chiaveMinima = null;
        int valoreMinimo = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < valoreMinimo) {
                chiaveMinima = entry.getKey();
                valoreMinimo = entry.getValue();
            }
        }
        return chiaveMinima;
	}
}