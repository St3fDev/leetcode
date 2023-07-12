class Solution {
    public int strStr(String haystack, String needle) {
        int index = -1;
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for(int i = 0; i < haystack.length(); i++) {    
            int cont = 0;
            int j = i;
            if (haystack.charAt(j) == needle.charAt(cont)) {
                index = i;
                while(cont < needle.length() && j < haystack.length()) {
                    if (haystack.charAt(j) != needle.charAt(cont)) {
                        index = -1;
                        break;
                    }
                    cont++;
                    j++;
                } 
            }
            if (cont == needle.length()) {
                return index;
            }
        }
        return -1;
    }
}