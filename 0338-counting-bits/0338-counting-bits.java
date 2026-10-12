class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i = 0; i<=n;i++){
            int count = 0;
            int b = i;
            while(b!=0){
                if((b&1)==1){
                    count++;
                    
                }
                b = b>>1;
            }
            arr[i] = count;
        }
        return arr;
        
    }
}