class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
         if(digits[n-1] <9){
            digits[n-1] = digits[n-1]+1;
            return digits;
                
            }

        for(int i = n-1; i>=0; i--){
           
            if(digits[i]+1>9 && i==0){
                int[]arr = new int[n+1];
                arr[0] =  1;
                for(int j = 1; j<n+1;j++){
                    arr[j] = 0;

                } 
                return arr;


            }else{
                
                if(digits[i]+1 ==10){
                    digits[i] = 0;

                   
                }else{
                    digits[i] = digits[i]+1;
                    return digits;
                }
            }
        

           
        }

        return digits;
        
    } 


}