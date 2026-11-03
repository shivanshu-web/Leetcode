class Solution {
    public int minMoves(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i<nums.length;i++){
            max =Math.max(max,nums[i]);
            sum += nums[i];
        }
        max = max*nums.length;
        return max-sum;
        
    }
}