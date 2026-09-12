class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;
        Arrays.sort(nums);

        int max = 0;

        int temp =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                temp++;
                max = Math.max(max,temp);
            }
            else{
                temp =0;
            }
        }
        return max + 1;
        
    }
}
