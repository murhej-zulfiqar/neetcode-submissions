class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = -1;
        for(int i =0 ;i< matrix.length;i++){
            int n = matrix[i].length;
            if(target <= matrix[i][n-1]){
                row =i;
                break;
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
