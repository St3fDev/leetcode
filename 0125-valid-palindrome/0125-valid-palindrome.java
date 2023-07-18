class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        if (s.isEmpty()) return true;
         String sub1 = "";
        if (s.length() % 2 == 0) {
            sub1 = s.substring(0,s.length()/2);
        } else {
            sub1 = s.substring(0,s.length()/2 + 1);
        }
        String sub2 = s.substring(s.length()/2,s.length());
        StringBuilder reversed = new StringBuilder(sub2).reverse();
        String reversedS = reversed.toString();
        
        if (sub1.equals(reversedS)) return true;
        return false;
    }
}