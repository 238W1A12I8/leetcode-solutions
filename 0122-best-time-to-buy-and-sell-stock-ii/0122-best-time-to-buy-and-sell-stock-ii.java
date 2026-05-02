class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int st=prices[0];
        int le=prices.length;
        for(int i=1;i<le;i++){
            if(st<prices[i]) max+=prices[i]-st;
            st=prices[i];
        }
        return max;
    }
}