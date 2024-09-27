class Solution {
    public boolean isValid(String s) {
       Stack<Character> validParentheses = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') validParentheses.push(c);
            else {
                if (validParentheses.isEmpty()) return false;
                if ((c == ')' && validParentheses.peek() == '(') || (c == ']' && validParentheses.peek() == '[') || (c == '}' && validParentheses.peek() == '{')) validParentheses.pop();
                else return false;
            }
        }
        if (!validParentheses.isEmpty()) return false;
        return true;
    }
}