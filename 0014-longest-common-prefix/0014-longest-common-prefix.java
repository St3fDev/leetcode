class Solution {
    public String longestCommonPrefix(String[] strs) {
        String stringaPiuCorta = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < stringaPiuCorta.length()) {
                stringaPiuCorta = strs[i];
            }
        }
        int cont = 0;
        while(cont != strs.length) {
            for (String str : strs) {
                if (str.startsWith(stringaPiuCorta)) 
                    cont++;
                else {
                    stringaPiuCorta = stringaPiuCorta.substring(0, stringaPiuCorta.length() - 1);
                    cont = 0;
                    break;
                }
            }
        }
        return stringaPiuCorta;
    }
}