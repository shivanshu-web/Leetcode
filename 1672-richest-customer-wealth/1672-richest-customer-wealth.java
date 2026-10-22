class Solution {
    public int maximumWealth(int[][] accounts) {
        int welth = 0;

        for(int i =0;i<accounts.length;i++){
            int TW = 0;
            for(int j = 0;j<accounts[0].length;j++){
               
                TW += accounts[i][j];
                

            }
            welth = Math.max(welth,TW);
        }

        return welth;
        
    }
}