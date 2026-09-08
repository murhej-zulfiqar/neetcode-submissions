class Solution {
    public int[] twoSum(int[] nums, int target) {

        int []result = new int[2];

        Set<Integer> visited = new HashSet();
        boolean found = false;
        for(int i=0;i<nums.length-1;i++){
            if(visited.contains(nums[i]) || visited.contains(target - nums[i]))
                continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i]){
                    result[0] = i;
                    result[1] = j;
                    found = false;
                    break;
                }
            }
            if(found)
                break;
            visited.add(nums[i]);
            visited.add(target - nums[i]);
        }
        return result;
        
    }
}
