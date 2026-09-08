class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> items = new HashMap();
        List<List<String>> result = new ArrayList();
        for(String s:strs){
            String hash = this.getMapHash(s);
            items.putIfAbsent(hash, new ArrayList());
            items.get(hash).add(s);
        }
        return new ArrayList(items.values());
    }

    private String getMapHash(String s){
        int []freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }
        return  Arrays.toString(freq);

    }
}
