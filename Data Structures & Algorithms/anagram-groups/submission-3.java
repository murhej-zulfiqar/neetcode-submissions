class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> items = new HashMap();

        List<List<String>> result = new ArrayList();
        for(String s:strs){
            String hash = this.getMapHash(s);
            List<String> temp = new ArrayList();
            if(items.containsKey(hash)){
                temp = items.get(hash);
            }
            temp.add(s);
            items.put(hash, temp);
        }
        // for(Map.Entry<String, List<String>> entry: items.entrySet()){
        //     result.add(entry.getValue());
        // }

        // return result;
        return items.values().stream().toList();

    }

    private String getMapHash(String s){
        int []freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        return Arrays.stream(freq)
        .mapToObj(String::valueOf)
        .collect(Collectors.joining(","));

    }
}
