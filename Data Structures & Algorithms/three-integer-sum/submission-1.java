class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<String> sols = new HashSet();
        List<List<Integer>> result = new ArrayList();
        for(int i=0;i < nums.length - 1;i++){
            int j=i+1;
            int k = nums.length -1;
            while(j < k){
                int tempSum = nums[i] + nums[j] + nums[k];
                if(tempSum == 0){
                    String sol = nums[i]+"#"+nums[j]+"#"+nums[k];
                    if(!sols.contains(sol)){
                        List<Integer> solution = new ArrayList();
                        solution.add(nums[i]);
                        solution.add(nums[j]);
                        solution.add(nums[k]);
                        result.add(solution);
                        sols.add(sol);
                    }
                    j++;
                    k--;
                }
                else{
                    if(tempSum > 0){
                        k--;
                    }
                    else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
