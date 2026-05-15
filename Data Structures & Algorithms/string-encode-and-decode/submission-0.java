class Solution {

    public String encode(List<String> strs) {
    StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0 ; 
        while( i < str.length()){
             int j = i ;
            while(str.charAt(j)!= '#'){
                j++;
            }
            String sub = str.substring(i,j);
            int len = Integer.parseInt(sub);
            decodedList.add(str.substring(j+1 , j+1+len));
            i = j + 1 + len ;
            System.out.println(sub);
        }

        return decodedList;
    }
}
