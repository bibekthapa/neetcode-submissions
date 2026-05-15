class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> sMap = new HashMap<>();

        for(int n : nums){
            sMap.put(n , sMap.getOrDefault(n,0) + 1 );
        }

        PriorityQueue<Map.Entry<Integer,Integer>> res = new PriorityQueue<>(Collections.reverseOrder(Map.Entry.comparingByValue()));

        res.addAll(sMap.entrySet());

        int[] resArray = new int[k];

        for(int i = 0 ; i < k ; i ++){
           if(!res.isEmpty()){
                Map.Entry<Integer,Integer> temp = res.poll();
                resArray[i] = temp.getKey();
           }
        }


        return resArray;
        
    }
}
