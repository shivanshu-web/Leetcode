class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int temp = 0;
        int left = 0;
        int right = 0;
        while(right<nums.length){
             
            if(nums[right]==0 ){
                temp = right-left;
               
                maxCount = Math.max(temp,maxCount);
                left = right;
                while( left<nums.length && nums[left]==0  ){
                    left++;
                }
                right = left;
            }else{
                temp = right-left+1;
                maxCount = Math.max(temp,maxCount);

                right++;

            }
            
        }
        return maxCount;
        
    }
}