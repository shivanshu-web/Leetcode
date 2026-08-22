class Solution {
    public int numberOfSteps(int num) {
        int step = 0;

        if(num==0){
            return 0;
        }

        while(num != 1){
            if(num%2==0){
                num = num/2;
                step++;
            }else{
                step += 2;
                num = num/2;
            }
        }

        return step +1;

        
        
    }
}