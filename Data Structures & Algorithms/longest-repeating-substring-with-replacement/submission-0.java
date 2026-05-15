class Solution {
    public int characterReplacement(String s, int k) {
        int[] inputStringArray = new int[26];
        int lp = 0 ; 
        int n = s.length();
        int maxLength = 0 ; 
        int maxFreq = 0 ; 
        for(int rp = 0 ; rp < n ; rp++){

            char c = s.charAt(rp);
            inputStringArray[c-'A']++;
            maxFreq = Math.max(maxFreq , inputStringArray[c-'A']);
            int window = rp - lp + 1 ;
            int replacementNeeded = window - maxFreq ;

            if(replacementNeeded > k){
                inputStringArray[s.charAt(lp) - 'A']-- ; 
                lp++;
            } 


            maxLength = Math.max(maxLength , rp - lp + 1 );


        }

    return maxLength;
        
    }
}
