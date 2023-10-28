class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> buckets = new HashMap<>();
        List<List<Integer>> result = new ArrayList();
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (!buckets.containsKey(groupSizes[i])) {
                buckets.put(size, new ArrayList());
            }
            buckets.get(size).add(i);
            if (buckets.get(size).size() == size) {
                result.add(buckets.get(size));
                buckets.put(size, new ArrayList());
            }
        }
        return result;
    }
}