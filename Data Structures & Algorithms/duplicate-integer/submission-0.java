class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums.length == 0 ) return false; 
        if(nums.length == 1 ) return false;
        Map<Integer,Integer> elements = new HashMap<>();
        for(int n : nums){
            if(elements.containsKey(n)){
                return true;
            }
            elements.put(n , elements.getOrDefault(n,0) + 1 );
        }

        return false;
    }
}