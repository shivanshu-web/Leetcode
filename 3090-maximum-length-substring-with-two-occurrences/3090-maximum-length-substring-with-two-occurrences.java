class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;

        while(right<s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while(map.containsValue(3)){
                map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)-1);
                left++;
            }

            count = Math.max(count,right-left+1);
            right++;
        }
        return count;

        
    }
}