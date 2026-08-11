class Solution {
    public int missingInteger(int[] nums) {
      
       
        int j =1;
        int sum  = nums[0];

       while(j<nums.length){
        if(nums[j-1] +1 == nums[j]){
            sum += nums[j];
            j++;
        }else{
           
            break;
           
        }
       }
        
        Arrays.sort(nums);
        
        for(int k = 0; k<nums.length;k++){
            if(nums[k] == sum){
                sum++;
            }


       }
       return sum;
        
    }
}