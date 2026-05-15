class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> topKMap = new HashMap<>();
        
        for(int n : nums){
            topKMap.put(n , topKMap.getOrDefault(n,0) + 1 );
        }

        PriorityQueue<Map.Entry<Integer,Integer>> res = new PriorityQueue<>(Collections.reverseOrder(Map.Entry.comparingByValue()));

        res.addAll(topKMap.entrySet());
        int[] topKArray = new int[k];
        
        for(int i = 0 ; i < k ; i++ ){
            if(!res.isEmpty()){
                Map.Entry<Integer,Integer> temp = res.poll();
                topKArray[i] = temp.getKey();
            }
        }
        
        return topKArray;
    }
}
