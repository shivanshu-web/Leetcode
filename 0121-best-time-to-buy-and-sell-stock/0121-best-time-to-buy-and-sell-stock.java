import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for(int i=1;i<prices.length;i++){
            int currProfit = 0;
            if(buy>prices[i]){
                buy = prices[i];
            }else{
                currProfit = prices[i]-buy;
            }

            maxProfit = Math.max(currProfit,maxProfit);
            

        }

        return maxProfit;
        



        
    }
}