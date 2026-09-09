class Solution {

    Map<String,List<String>> encodedStrings = new HashMap();
    public String encode(List<String> strs) {
        List<String> hashes = new ArrayList();
        for(String s: strs){
            hashes.add(s.length()+"#"+s);
        }
        String hash = String.join("$",hashes);
        encodedStrings.putIfAbsent(hash, strs);
        return hash;
        
    }

    public List<String> decode(String str) {
        if(this.encodedStrings.containsKey(str)){
            return this.encodedStrings.get(str);
        }
        return new ArrayList();
    }
}
