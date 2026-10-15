class Solution {
    public int sumCounts(List<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum  = 0;

        for(int i =0;i<nums.size();i++){
            for(int j =i;j<nums.size();j++){
                for(int k=i;k<=j;k++){
                    map.put(nums.get(k),map.getOrDefault(nums.get(k),0)+1);
                }
                sum += Math.pow(map.size(),2);
                map.clear();
            }

        }

        return sum;
        
    }
}