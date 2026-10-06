class Solution {
    public int trailingZeroes(int n) {
        int result = n/5;
        int count =result;

        while(5<=result){
            int d = result/5;
            count +=d;
            result = d;
        }

        return count;
       
       
        
    }
}