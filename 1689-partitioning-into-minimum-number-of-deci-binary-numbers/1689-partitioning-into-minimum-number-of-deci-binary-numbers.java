class Solution {
    public int minPartitions(String n) {
        int max = -1;
        for (int i = 0; i < n.length(); i++) {
            char carattere = n.charAt(i);
            int number = 0;
            if (Character.isDigit(carattere)) {
                number = Character.getNumericValue(carattere);
            }
            if (max < number){
                max = number;
            }
        }
        return max;
    }
}