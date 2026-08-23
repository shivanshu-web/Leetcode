class Solution {
    public int maxPower(String s) {

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                maxLen = Math.max(maxLen,right-left+1);
                right++;
            }else{
                left = right;
            }

        }

        return maxLen;


        
    }
}