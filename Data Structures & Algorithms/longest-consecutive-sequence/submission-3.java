class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        if(n==0) return 0;
        if(n==1) return 1;
        int prev = nums[0];
        int count = 1 ; 
        int maxCount = 0 ;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == (nums[i-1] + 1) || nums[i] == nums[i-1] ){
                if(nums[i] == (nums[i-1]+1)){
                    count++;
                    
                }
            }else{
                count = 1 ; 
            }
            maxCount = Math.max(maxCount , count );
        }
        
        return maxCount;
    }
}
