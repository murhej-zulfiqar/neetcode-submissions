class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int []result = new int[temperatures.length];
        Stack<Integer> indicies = new Stack();

        for(int i=0;i<temperatures.length;i++){

            while(!indicies.empty() && temperatures[i] > temperatures[indicies.peek()] ){
                int j = indicies.pop();
                result[j] = i - j;
            }

            indicies.push(i);

        }
        return result;
    }
}
