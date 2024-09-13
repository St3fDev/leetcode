class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentList = new ArrayList<>();
        currentList.add(1);
        while(rowIndex > 0) {
            List<Integer> tempList = new ArrayList<>(); 
            tempList.add(currentList.get(0));
            for (int i = 0; i < currentList.size(); i++) {
                for (int j = i+1; j < currentList.size(); j++) {
                    tempList.add(currentList.get(i) + currentList.get(j));
                    break;
                }
            }
            tempList.add(currentList.get(0));
            currentList = tempList;
            rowIndex--;
        } 
        return currentList;
    }
}