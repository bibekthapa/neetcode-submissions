class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> resMap = new HashMap<>();
        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newS = new String(charArray);

            if(!resMap.containsKey(newS)){
                resMap.put(newS , new ArrayList<>());
            }

             resMap.get(newS).add(str);

        }
        
        resMap.entrySet().stream().forEach(System.out::println);

        return new ArrayList<>(resMap.values());
    }
}
