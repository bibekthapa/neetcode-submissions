class Solution {
    public boolean isPalindrome(String s) {
        // two pointer problem
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String filtered = sb.toString().toLowerCase();

        System.out.println(filtered);
        int n = filtered.length();
        int lp = 0 ; 
        int rp = n -1 ;
      
        while(lp < rp){
            if(filtered.charAt(lp) != filtered.charAt(rp)) return false;
            lp++;
            rp--;
        }
     
    
        return true;
        
    }
}
