class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length-1;
        int move = 0;

     while(move <= two){

        if(nums[move]==0){
          
           
           int t = nums[zero];
           nums[zero] = nums[move];
           nums[move] = t;
           move++;
           zero++;


        }else if(nums[move]==2){
           
            int t = nums[move];
            nums[move] = nums[two];
            nums[two] = t;
            two--;
        }else{
            move++;
        }
        
    }

        
    }
}