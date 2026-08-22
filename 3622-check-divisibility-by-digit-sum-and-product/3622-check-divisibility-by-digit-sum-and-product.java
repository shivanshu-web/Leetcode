class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int real = n;
        while(n!=0){
            int d = n%10;
            sum += d;
            mul *=d;
            n = n/10;
        }

        return (real%(sum+mul)==0);
        
    }
}