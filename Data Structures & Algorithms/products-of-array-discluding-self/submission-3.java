class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int []result = new int[nums.length];
        int zeros =0;
        int prod =1;
        for(int num:nums){
            if(num == 0){
                zeros++;
            }
            else{
                prod *=num;
            }
        }

        if(zeros > 1){
            return result;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                result[i] = prod;
            }
            else{
                result[i] = (prod/nums[i]) * (zeros == 0 ? 1 : 0);
            }
        }
        return result;

    }
}  
