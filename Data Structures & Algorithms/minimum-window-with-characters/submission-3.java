class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer> need = new HashMap<>();

        for(char c : t.toCharArray()){
            need.put(c , need.getOrDefault(c,0) + 1 );
        }

        int have = 0 ;
        int needCount = need.size();
        Map<Character,Integer> window = new HashMap<>();
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        int lp = 0 ;
        int start = 0 ;
        int rp = 0 ;
        while(rp < n){
            char c = s.charAt(rp);
            window.put(c , window.getOrDefault(c,0) + 1 );

            if(window.get(c) == need.get(c)){
                have++;
            }

            while(have == needCount){
                if( rp - lp + 1 < minLen){
                    minLen = rp - lp + 1 ;
                    start = lp;
                }

                char leftChar = s.charAt(lp);
                window.put(leftChar , window.get(leftChar) - 1 );

                if(need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) have--;
                lp++;
            }

            rp++;
        }
        return minLen == Integer.MAX_VALUE?"":s.substring(start , start+minLen);

    }
}
