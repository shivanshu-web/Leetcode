class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = 1;
        int[] suf = new int[nums.length];
        suf[0] = 1;
        int[] result = new int[nums.length] ;
        
        for(int i = 1; i<nums.length;i++){
            pre[i] = pre[i-1]*nums[i-1];
            suf[i] = suf[i-1]*nums[nums.length-i];

        }

        for(int i =0;i<nums.length;i++){
            result[i] = pre[i]*suf[nums.length-1-i];
        }

        return result;

        
    }
}