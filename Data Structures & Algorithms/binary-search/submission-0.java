class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, target, nums);

    }

    private int binarySearch(int left, int right, int target, int []nums){
        if(right < left){
            return -1;
        }
        int middle = (left + right)/2;
        if(nums[middle] == target){
            return middle;
        }
        else if (nums[middle] > target){
            return binarySearch(left, middle-1, target, nums);
        }
        else{
            return binarySearch(middle+1, right, target, nums);

        }
    }
}
