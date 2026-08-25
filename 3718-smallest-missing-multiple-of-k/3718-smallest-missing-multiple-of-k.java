class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }

        for(int i = 1 ; i<=nums.length; i++){
            int c = 0;
            if(map.containsKey(k*i)){
               c = 1;
               
            }else{
                return k*i;
            }
        }

        return k*(nums.length+1);
       

        
    }
}