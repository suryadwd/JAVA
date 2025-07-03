import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char []arr = s.toCharArray();
        for(char x : arr){
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
            }
            else if(stack.isEmpty()) return false;
            else if ( (x == ')' && stack.peek() == '(') || (x == ']' && stack.peek() == '[') || x  =='}' && stack.peek() == '{' ){
                stack.pop();
            } else return false;
            }
        
        return stack.size() == 0;
    }
}