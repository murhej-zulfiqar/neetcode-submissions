class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice =0;
        int minPrice= 101;
        int max = 0;
        for(int i=0;i< prices.length;i++){
            if(prices[i] < minPrice){
                max = Math.max(max, maxPrice - minPrice);
                maxPrice = prices[i];
                minPrice = prices[i];
            }
            else{
                maxPrice = Math.max(maxPrice, prices[i]);
                max = Math.max(max, maxPrice - minPrice);
            }
        }

        return Math.max(max, maxPrice - minPrice);
    }
}
