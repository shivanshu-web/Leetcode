class Solution {
    public int[] runningSum(int[] nums) {
        int[] prifix = new int[nums.length];
        prifix[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            prifix[i] = nums[i]+prifix[i-1];
        }

        return prifix;
        
    }
}