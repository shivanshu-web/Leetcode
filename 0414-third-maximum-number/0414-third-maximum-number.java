class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        if(nums.length<3){
            return nums[nums.length-1];
        }
        int i = nums.length-2;
        int j = 0;
        boolean t = false;

        if(nums[nums.length-1] != nums[nums.length-2]){
            j = 1;
            
        }else{
            j = 0;
            t = true;
            
        }

        
        while(i>=0){
            if(nums[i] != nums[i+1]){
                j++;
                if(t && j ==2){
                    return nums[i];
                }
                if(j==3){
                    return nums[i];

                }
                
                
            }
            i--;
        }
        
        return nums[nums.length-1];
        
    }
}