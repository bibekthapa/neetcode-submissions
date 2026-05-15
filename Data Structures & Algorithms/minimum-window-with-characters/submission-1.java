class Solution {
    public String minWindow(String s, String t) {

        if(t.length() > s.length()) return "";
        Map<Character,Integer> need = new HashMap<>();

        for(char c : t.toCharArray()){
            need.put( c , need.getOrDefault(c,0) + 1  );
        }
       // need.entrySet().stream().forEach(System.out::println);

        Map<Character,Integer> window = new HashMap<>();

        int needLength = need.size();
        int lp = 0 ; 
        int  mainStringL = s.length();
        int have = 0 ;
        int minLen = Integer.MAX_VALUE;
        int start = 0 ;
        for(int rp = 0 ; rp < mainStringL ; rp++){
            char c = s.charAt(rp);
            window.put(c , window.getOrDefault(c,0) + 1 ) ;

            if(need.containsKey(c) && need.get(c).intValue() == window.get(c).intValue()){
                have++;
            }

            while(have == needLength){
                if((rp - lp +  1) < minLen ){
                    minLen = rp - lp + 1 ;
                    start = lp;
                }

                char leftChar = s.charAt(lp);
                window.put(leftChar , window.get(leftChar) - 1 );

                if(need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)){
                    have--;
                }

                lp++;
            }
        }
        
        return minLen == Integer.MAX_VALUE?"":s.substring(start , start + minLen);

    }
}
