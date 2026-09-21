class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        int ans = 0;

        while(left<=right){
            int mid = left+(right-left)/2;

            long midd = mid*mid;
            if(midd==x){
                return mid;
            }
            if(midd>x){
                right = mid-1;
            }else{
                ans = mid;
                left = mid+1;
            }

        }

        return ans;

    }
}