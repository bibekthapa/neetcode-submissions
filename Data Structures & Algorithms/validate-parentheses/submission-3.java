class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0 || s.length() == 1 ) return false;
        char[] strToChar = s.toCharArray();
        Stack<Character> queue = new Stack<>();
        int lp = 0 ; 
        Map<Character,Character> parMap = new HashMap<>();
        parMap.put('(' , ')');
        parMap.put('{' , '}');
        parMap.put('[' , ']');
        
        for(int rp = 0 ; rp < s.length() ; rp++){
            char c = s.charAt(rp);
            if(c == '(' || c == '{' || c == '['){
                queue.push(c);
            }else{
                if(queue.isEmpty()) return false;
                char lastChar = queue.pop();
                System.out.println(lastChar);
                System.out.println(c);
                if(lastChar == '(' && c != ')' || lastChar == '{' && c != '}' || lastChar == '[' && c != ']' ){
                    return false;
                }
            }
            
        }

        queue.stream().forEach(System.out::println);

        return queue.isEmpty();
      
        
    }
}
