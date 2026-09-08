class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Set<Integer> visited = new HashSet();
        for(int i=0;i<nums.length-1;i++){
            // if(visited.contains(nums[i]) || visited.contains(target - nums[i]))
            //     continue;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] == target - nums[i])
                    return new int[]{i,j};
            }
            // visited.add(nums[i]);
            // visited.add(target - nums[i]);
        }
        return new int[]{};
        
    }
}
