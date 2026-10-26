class Solution {
    public int  Rone(int num){
        int count = 0;
        while(num!=0){
            if(num%2==1){
                count++;
               
            }
             num = num/2;
        }
        return count;
    }
    public int calculateScore(int a, int b) {
        int numa = Rone(a);
        int numb = Rone(b);
        if(numa>=numb){
            return numa*numb;
        }
        return (int)numb/numa;
        
    }
}