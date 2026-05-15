class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1 ) return false;
        Stack<Character> stack = new Stack<>();
        for(int rp = 0 ; rp < s.length() ; rp++){
            char c = s.charAt(rp);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char lastChar = stack.pop();
                if(lastChar == '(' && c != ')' || lastChar == '{' && c != '}' || lastChar == '[' && c != ']' ){
                    return false;
                }
            }
            
        }

        return stack.isEmpty();
      
        
    }
}
