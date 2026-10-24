class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                nums[i] = -1;
            }
        }
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            pre[i] = pre[i-1] + nums[i];
        }
        int count = 0;
        map.put(0,-1);
        
        for(int i = 0; i<nums.length;i++){
            if(map.containsKey(pre[i])){
                count = Math.max(count , i - map.get(pre[i]));
            }else{
                map.put(pre[i],i);
            }
        }
        

            
        
        return count;
        
    }
}