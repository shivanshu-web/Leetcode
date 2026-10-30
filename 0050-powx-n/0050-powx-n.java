class Solution {
    public double pow(double x,int n){
        
        if(n==0){
            return 1;
        }
        double num = pow(x,n/2);
        num = num * num;
        if(n%2!=0){
            return x*num;
        }
        return num;

    }
    public double myPow(double x, int n) {
        if(n<0){
            return 1/pow(x,n);
        }
       return pow(x,n);

        
    }
}