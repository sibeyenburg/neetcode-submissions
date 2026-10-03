class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> myDictionary = new HashMap<>();
        for (int i = 0; i < nums.length; i++ ){
            myDictionary.merge(nums[i], 1, (oldValue, newValue) -> oldValue + newValue);
        }
       List<Integer> topKeys = myDictionary.entrySet().stream()
                
                .sorted(Map.Entry.<Integer,          Integer>comparingByValue(Collections.reverseOrder()))
                .limit(k) 
                .map(Map.Entry::getKey) 
                .collect(Collectors.toList());
    
    return topKeys.stream().mapToInt(Integer::intValue).toArray();
    }
}
