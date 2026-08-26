class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ReqSum = 0;
        int alisSum = 0;
        int bobSum = 0;
        int[] ans = new int[2];
        for(int i = 0; i<aliceSizes.length;i++){
            alisSum += aliceSizes[i];
        }
        for(int i = 0; i<bobSizes.length;i++){
            bobSum += bobSizes[i];
        }

        ReqSum = (alisSum+bobSum)/2;
        for(int i =0; i<aliceSizes.length;i++){
            for(int j=0;j<bobSizes.length;j++){
                if(alisSum+bobSizes[j]-aliceSizes[i]==ReqSum){
                    ans[0] = aliceSizes[i];
                    ans[1]= bobSizes[j];
                    return ans;

                } 
            }
        }
        return ans;


             
        
    }
}