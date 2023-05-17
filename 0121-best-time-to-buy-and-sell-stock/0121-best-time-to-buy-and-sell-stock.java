class Solution {
    public int maxProfit(int[] prices) {
        int diff=0;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            diff=prices[i]-min;
            if(diff<0){diff=0;}
            min=Math.min(prices[i],min);
            profit=Math.max(diff,profit);
        }
        return profit;
    }
}