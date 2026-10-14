class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder  ans = new StringBuilder();
        int i = 1;
        if(sum>9*num){
            return "";
        }

        while(i<=num){
            if(9<=sum){
               ans.append(9);
                sum = sum-9;
                i++;
                
            }else{
                ans.append(sum);
                i++;
                
                break;
            }
        }
        for(int j =0; j<=num-i;j++){
            ans.append(j-j);
        }
        return ans.toString();
    
        
    }
}