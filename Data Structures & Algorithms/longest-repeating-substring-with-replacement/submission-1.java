class Solution {
    public int characterReplacement(String s, int k) {
        
        int lp = 0 ; 
        int[] inputArray = new int[26];
        int n = s.length();
        int maxFreq = 0 ; 
        int maxLength = 0 ; 
        for(int rp = 0 ; rp < n ; rp++){

            char c = s.charAt(rp);
            inputArray[c - 'A']++ ;
            maxFreq = Math.max(maxFreq , inputArray[c-'A']);
            int window = rp - lp + 1 ;

            int replacementNeeded = window - maxFreq ;

            if(replacementNeeded > k ){
                inputArray[s.charAt(lp) - 'A']--;
                lp++;
            }

            maxLength = Math.max(maxLength , rp - lp + 1 );
        }
        
        return maxLength;
    }
}
