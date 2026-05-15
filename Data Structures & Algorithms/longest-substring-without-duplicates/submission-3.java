class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int lp = 0 ; 
        
        Map<Character,Integer> uniqueChar = new HashMap<>();
        int inputSize = s.length(); 

        if(inputSize == 0 ) return 0;
        int max = Integer.MIN_VALUE;
        for(int rp = 0 ; rp < inputSize ; rp++ ){
            char c = s.charAt(rp);
            if(uniqueChar.containsKey(c)){
                lp = Math.max(lp , uniqueChar.get(c) + 1 );
                
            }
             uniqueChar.put(c , rp);
            max = Math.max(max , rp - lp + 1 );
           
        }
        
        return max ;
    }
}
