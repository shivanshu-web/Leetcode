/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int result = 0;

        int left = 1;
        int right = n;
        while(left<=right){
            int mid = ((right-left)/2)+left;

            if(isBadVersion(mid)){
                result = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }

        }

        return result;
        
        
    }
}