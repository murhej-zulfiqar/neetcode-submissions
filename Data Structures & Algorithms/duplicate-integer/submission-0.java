class Solution {

    Set<Integer> items = new HashSet();
    public boolean hasDuplicate(int[] nums) {

        for(int i: nums){
            if(items.contains(i)){
                return true;
            }
            items.add(i);
        }
        return false;
        
    }
}