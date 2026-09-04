class Solution {
    public int longestOnes(int[] nums, int k) {
        int[] arr = new int[2];
        int left = 0;
        int right = 0;
        int count = 0;
        while(right<nums.length){
            arr[nums[right]]++;
            while(arr[0]>k){
                arr[nums[left]]--;
                left++;
            }
            count = Math.max(count,right-left+1);
            right++;

        }
        return count;
        
    }
}