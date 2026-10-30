class Solution {

    public int pow(int a ,int b){
        if(b==0){
            return 1;
        }
        long num = pow(a,b/2);
       
        num = num%1337;
        num = (num* num)%1337;
        if(b%2!=0){
            return (int)((a*num)%1337);
        }
        return (int)(num%1337);
    }
    public int superPow(int a, int[] b) {
        int num = 1;
        
        for(int i = 0;i<b.length;i++){
            num = pow(num,10)%1337;
            int p = pow(a,b[i])%1337;
            num = (num*p)%1337;
            num = num%1337;
        }
       
        return  num%1337;
        
    }
}