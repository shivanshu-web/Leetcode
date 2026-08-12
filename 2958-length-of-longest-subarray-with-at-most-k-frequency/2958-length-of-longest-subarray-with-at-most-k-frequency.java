class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int right =0; 
        int left = 0;
        int max = 0;

        while(right<nums.length){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

           

            while(map.get(nums[right])>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                left++;
            }
             max = Math.max(right-left+1,max);
            right++;
        }

        return max;

       
        

       

      




        
    }
}