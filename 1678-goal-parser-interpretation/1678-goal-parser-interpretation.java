class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            char c = command.charAt(i);
            if (c == 'G' ) 
                str.append('G');
            else if(c == '(' && command.charAt(i+1) == ')')
                str.append('o');
            else if(c == '(' && command.charAt(i+1) == 'a')
                str.append("al");
        }
        return str.toString();
    }
}