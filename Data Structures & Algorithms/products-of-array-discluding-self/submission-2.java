class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int []result = new int[nums.length];
        Set<Integer> zeros = new HashSet();
        int total =1;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == 0){
                zeros.add(i);
            }
            else{
                total *= nums[i];
            }
        }

        if(zeros.size() > 1){
            return result;
        }
        else if(zeros.size() == 0){
            for(int i=0;i<nums.length;i++){
                result[i] = total/nums[i];
            }
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(zeros.contains(i)){
                    result[i] = total;
                }
                else{
                    result[i] = 0;
                }
            }
        }

        return result;
    }
}  
