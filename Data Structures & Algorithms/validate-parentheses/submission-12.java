class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1 || s.length() == 0 ) return false;
        Stack<Character> bracketsStack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                bracketsStack.push(c);
            }
            else{
                if(bracketsStack.isEmpty()) return false;
                char ch = bracketsStack.pop();
                if( (c == '}' && ch != '{') || (c == ')' && ch != '(') || (c == ']' && ch != '[')){
                    return false;
                }
                
            }
        }

        return bracketsStack.isEmpty();
        
    }
}
