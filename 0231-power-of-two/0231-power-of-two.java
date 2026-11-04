class Solution {
    public boolean pow(int n){
        if(n==1){
            return true;
        }else if(n==0){
            return false;
        }
        else if(n %2!=0){
            return false;
        }
        return pow(n/2);
    }

    public boolean isPowerOfTwo(int n) {

        // return n>0 && (n &(n-1))==0;
        return pow(n);

        
    }
}