class Solution {
    public int smallestEvenMultiple(int n) {
        int smallest = n;
        while (smallest % n != 0 || smallest % 2 != 0) 
            smallest++;
        return smallest;
    }
}