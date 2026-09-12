class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> unique = new HashSet();

        for(int num: nums){
            unique.add(num);
        }

        int max =0;
        for(int num:unique){

            if(!unique.contains(num - 1)){
                int temp=1;
                while(unique.contains(num + temp))
                    temp++;
                max = Math.max(temp,max);
            }
        }
        return max;
        
    }
}
