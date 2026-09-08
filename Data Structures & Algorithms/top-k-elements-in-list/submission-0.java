class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqs = new LinkedHashMap();
        for(int num: nums){
            freqs.putIfAbsent(num, 0);
            Integer val =freqs.get(num);
            val++;
            freqs.put(num, val);
        }
        freqs = freqs.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .collect(Collectors.toMap(
                            Map.Entry::getKey, 
                            Map.Entry::getValue, 
                            (oldValue, newValue) -> oldValue,
                            LinkedHashMap::new                
                ));
        int []result = Arrays.stream(freqs.keySet().toArray(Integer[]::new)).mapToInt(Integer::valueOf).toArray();

        if(k >= freqs.size()){
            return result;
        }
        return Arrays.copyOfRange(result, result.length - k, result.length );    

        
    }
}
