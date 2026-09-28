class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int left = 0;
        int right = matrix.length - 1;
        int row = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int n = matrix[mid].length;

            if (target <= matrix[mid][n - 1]) {
                row = mid;
                right = mid - 1;  // search for an earlier matching row
            } else {
                left = mid + 1;
            }
        }
        if(row == -1)
            return false;
        

        return binarySearch(0, matrix[row].length -1 , target, matrix[row]);
    }

    private boolean binarySearch(int left, int right, int target, int []nums){
        if(right < left){
            return false;
        }
        int middle = (left + right)/2;
        if(nums[middle] == target){
            return true;
        }
        else if (nums[middle] > target){
            return binarySearch(left, middle-1, target, nums);
        }
        else{
            return binarySearch(middle+1, right, target, nums);

        }
    }
}
