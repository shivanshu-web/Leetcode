class Solution {
    public int maxPower(String s) {

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while(right<s.length()){
            if(s.charAt(left)==s.charAt(right)){

                if(maxLen<right-left+1){
                    maxLen = right-left+1;
                }
                right++;
                
            }else{
                left = right;
                right++;
            }
            

        }

        return maxLen;


        
    }
}