class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char c : stones.toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                int count = characterCountMap.get(c);
                characterCountMap.put(c, count + 1);
            } else {
                characterCountMap.put(c, 1);
            }
        }   
        int result = 0;
        for (char c : jewels.toCharArray()) {
            if (characterCountMap.containsKey(c)) {
                result += characterCountMap.get(c);
            }
        }
        return result;
    }
}