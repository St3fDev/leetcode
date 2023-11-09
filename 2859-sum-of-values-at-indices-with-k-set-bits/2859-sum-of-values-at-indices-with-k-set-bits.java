class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int result = 0;
        for (int i = 0; i < nums.size(); i++) {
            int val = i;
            int contBits = 0;
            while (val / 2 != 0) {
                if (val % 2 == 1) 
                    contBits++;
                val /= 2;
            }
            if (val % 2 == 1)
                contBits++;
            if (contBits == k)
                result += nums.get(i);
        }
        return result;
    }
}