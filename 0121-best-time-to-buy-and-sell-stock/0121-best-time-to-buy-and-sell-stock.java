class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int pro = 0;

        for(int i = 0;i<prices.length-1;i++){
            if(buy>prices[i+1]){
                buy = prices[i+1];
            }else{
                pro = Math.max(pro,prices[i+1]-buy);
            }
        }
        return pro;
        
    }
}