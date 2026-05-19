class Solution {
    public int characterReplacement(String s, int k) {
        
        
        int n = s.length();
        int lp = 0 ;
        int[] charCount = new int[26];
        int maxFreq = 0 ;  
        int maxLength = 0 ;   
        for(int rp = 0 ; rp < n ; rp ++){
            char c = s.charAt(rp);
            charCount[ c - 'A']++ ;

            int windowLength = rp - lp + 1 ;
            maxFreq = Math.max(maxFreq , charCount[c-'A']);

            int replacementNeeded = windowLength - maxFreq;

            if(replacementNeeded > k ){
                charCount[s.charAt(lp) - 'A'] -- ;
                lp++;
            }

            maxLength = Math.max(maxLength , rp - lp + 1 );

        }

        return maxLength;
    }
}
