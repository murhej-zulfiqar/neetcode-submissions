class Solution {

    Map<Character, Integer> sMap = null;
    Map<Character, Integer> tMap = null;
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;
        sMap = this.insertString(s);
        tMap = this.insertString(t);


        if(sMap.size() != tMap.size()){
            return false;
        }

        for(Map.Entry<Character, Integer> entry: sMap.entrySet()){
            if(!tMap.containsKey(entry.getKey()))
                return false;
            if(!tMap.get(entry.getKey()).equals(entry.getValue()))
                return false;
        }

        return true;
    }

    private Map<Character, Integer> 
    insertString(String temp ){
        Map<Character, Integer> map = new HashMap();
        for(char c:temp.toCharArray()){
            int val =1;
            if(map.containsKey(c)){
                val = map.get(c);
                val++;
            }
            map.put(c, val);
        }

        return map;
    }
}
