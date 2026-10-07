class Solution {
    public boolean isHappy(int n) {
        int seen = n;
        while(n!=1){
            
           
            int sq =0 ;
            while(n!=0){
                int d = n%10;
                sq += (int)Math.pow(d,2);
                n = n/10;

            }

             if(seen == sq){
                return false;
            }
            if(sq<10){
                seen = sq;
            }
           
           
            
            n = sq;

        }
        return true;
        
    }
}