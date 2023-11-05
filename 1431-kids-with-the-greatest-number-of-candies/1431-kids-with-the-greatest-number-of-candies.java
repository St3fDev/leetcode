class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            //if (candies[i] + extraCandies >= max)
            //    result.add(i,true);
            //else 
            //    result.add(i,false);
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }
}