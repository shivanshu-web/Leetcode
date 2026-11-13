class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLongI = 1;
        int maxLongD = 1;
        int maxLongIT = 1;
        int maxLongDT = 1;
        int left = 1;
        int right = nums.length-2;

        while(left<nums.length){
            if(nums[left]>nums[left-1]){
                maxLongIT++;
                maxLongI = Math.max(maxLongIT,maxLongI);
            }else{
                maxLongIT = 1;
            }

            if(nums[right]>nums[right+1]){
                maxLongDT++;
                maxLongD = Math.max(maxLongDT,maxLongD);
            }else{
                maxLongDT = 1;
            }
            left++;
            right--;

            



        }

        return Math.max(maxLongD,maxLongI);


        
    }
}