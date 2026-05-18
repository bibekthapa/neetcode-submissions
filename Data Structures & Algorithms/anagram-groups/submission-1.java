class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagramList = new ArrayList<>();
        Map<String,List<String>> anagramMap = new HashMap<>();
        for(String str : strs){

            char[] newChar = str.toCharArray();
            Arrays.sort(newChar);
            String transformed = new String(newChar);
            
            if(!anagramMap.containsKey(transformed)){
                anagramMap.put(transformed , new ArrayList<>());
            }
            
            anagramMap.get(transformed).add(str);

        }

        anagramMap.entrySet().stream().forEach(System.out::println);

        return new ArrayList<>(anagramMap.values());

    }
}
