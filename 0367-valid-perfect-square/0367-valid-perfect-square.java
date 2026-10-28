class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;     

        int right = num;
        long n = num;
        while(left<=right){
            long mid =( (right-left)/2) +left;
            long sq = mid*mid;
            
            if(sq ==n){
                return true;
            }else if (sq>n){
                right = (int)mid-1;
            }else{
                left = (int)mid+1;
            }
        }
        return false;

        
    }
}