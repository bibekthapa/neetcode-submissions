class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> numMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pqMap = new PriorityQueue<>(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for(int n : nums){
            numMap.put(n , numMap.getOrDefault(n,0) + 1 );
            
        }
        pqMap.addAll(numMap.entrySet());
       int[] topKArray = new int[k];
        for(int i = 0 ; i < k ; i++){
            if(!pqMap.isEmpty()){
                Map.Entry<Integer,Integer> temp = pqMap.poll();
                topKArray[i] = temp.getKey();
            }
        }
        return topKArray;
    }
}
