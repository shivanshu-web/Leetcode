class Solution {
    public int minMergedInteger(int[] nums) {
        int result = Integer.MAX_VALUE ;
        for(int i=0;i<nums.length;i+=2){
            String Temp = nums[i]+"";
            Temp = Temp + (nums[i+1] +"");
            result = Math.min(Integer.parseInt(Temp),result);

            
        }
        return result;

        
    }
}