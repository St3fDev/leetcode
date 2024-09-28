class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<Integer> input = Arrays.stream(nums) 
                                             .boxed()               
                                             .collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer,Integer> trackNumbers = new HashMap<>();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (!trackNumbers.containsKey(input.get(i))) {
                trackNumbers.put(input.get(i), 0);
                array.add(input.get(i));
                input.remove(i);
                i--;
                if (input.size() == 0) {
                    result.add(new ArrayList<>(array));
                }
            }
            else {
                for (int j = i; j < input.size(); j++) {
                    if (!trackNumbers.containsKey(input.get(j))) {
                        trackNumbers.put(input.get(j), 0);
                        array.add(input.get(j));
                        input.remove(j);
                        j--;
                    }
                }
                result.add(new ArrayList<>(array));
                trackNumbers.clear();
                array.clear();
                i--;
            }
        }
        return result;
    }
}