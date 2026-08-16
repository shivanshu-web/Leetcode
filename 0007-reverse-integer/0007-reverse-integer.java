class Solution {
    public int reverse(int x) {
        int reverse = 0;
        if(x<Math.pow(-2,31)){
            return 0;
        }else if(x>(Math.pow(2,31)-1)){
            return 0;
        }
        while(x!=0){
            int d = x%10;
            if(reverse>Integer.MAX_VALUE/10 || reverse==Integer.MAX_VALUE/10 && d>7 ){
                return 0;
            }else if(reverse<Integer.MIN_VALUE/10 || reverse==Integer.MIN_VALUE && d < -8){
                return 0;
            }
            reverse = reverse*10+d;
            x = x/10;
        }

         

        return reverse;
       

        
    }
}