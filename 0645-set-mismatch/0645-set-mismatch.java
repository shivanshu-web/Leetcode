class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;
        int summ = 0;
        int[] arr = new int[2];
        boolean[] duplicate = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            summ +=nums[i];
            if(duplicate[nums[i]]){
                dup = nums[i];
                
            }
            duplicate[nums[i]] = true;

           
        }
        int sum = (nums.length*(nums.length+1))/2;
        
        arr[0] = dup;
        arr[1] = (sum-summ) + dup;
        return arr;
        
    }
}