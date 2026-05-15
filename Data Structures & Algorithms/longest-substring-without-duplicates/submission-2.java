class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int lp = 0 ;
        int n = s.length();
        if(n == 0 ) return 0;

        Map<Character,Integer> uniqueCharacters = new HashMap<>();
        int max = Integer.MIN_VALUE ;
        for(int rp = 0 ; rp < n ; rp++){
            char c = s.charAt(rp);
            if(uniqueCharacters.containsKey(c)){
                lp = Math.max(lp , uniqueCharacters.get(c) + 1) ;
            }

            uniqueCharacters.put(c , rp);
            max = Math.max(max , rp - lp + 1 );
        }

        return max;
        
    }
}
