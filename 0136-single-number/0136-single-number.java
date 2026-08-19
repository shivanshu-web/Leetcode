class Solution {
    public int singleNumber(int[] nums) {
        
        int j = 1;
        int res = nums[0];
        while(j<nums.length){
            res = res^nums[j];
            j++;
            
        }
        return res;
        
    }
}