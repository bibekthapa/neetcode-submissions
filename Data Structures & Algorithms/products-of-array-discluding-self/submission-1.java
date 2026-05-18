class Solution {
    public int[] productExceptSelf(int[] nums) {
    
       int n = nums.length;
       int[] resultLeft = new int[n];
       int[] resultRight = new int[n];

        //[1,1,2,8]
        //[48,24,6,1]
        resultLeft[0] = 1 ;
       for(int i = 1 ; i < n ; i++){
            resultLeft[i] = resultLeft[i-1] * nums[i-1];
          //  System.out.println(resultLeft[i]);
       }

       resultRight[n-1] = 1 ;
       for(int i = n - 2  ; i >= 0 ; i--){
            resultRight[i] = resultRight[i+1] * nums[i+1];
  
       }

        int[] result = new int[n];
       for(int i = 0 ; i < n ; i++){
            result[i] = resultLeft[i] * resultRight[i];
       }

       

        return result;
    }
}  
