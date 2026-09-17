class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int i=0;
        int j=numbers.length -1;
        int []result = new int[2];
        while(i < j){
            if(numbers[j] > (target - numbers[i])){
                j--;
            }
            else if(numbers[j] < (target - numbers[i])){
                i++;
            }
            else{
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            }
        }
        return result;
        
    }
}
