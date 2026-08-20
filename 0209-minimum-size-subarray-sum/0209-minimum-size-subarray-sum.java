class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int Msum = Integer.MIN_VALUE;
        int windowS = 0;
        int len = Integer.MAX_VALUE;
        int j= 0;
        int i=0;

        while(j<nums.length){
            if(windowS<target){
                windowS +=nums[j];
                
                
            }
            if( i<=j  && windowS>=target ){
                while(i<=j  && windowS>=target){
                    len = Math.min(len,j-i+1);
                    Msum = Math.max(Msum,windowS);
                    windowS = windowS-nums[i];
                    i++;
   
                }

            }
            j++;
            
        }
        if(Msum<target){
            return 0;
        }else{
            return len;
        }
        
       
        
    }
}