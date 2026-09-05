class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean[] arr = new boolean[n];
        int count = 0;
        for(int i = 2; i*i<n;i++){
            if(!arr[i]){
                for(int j =2; j*i<n;j++){
                    arr[i*j] = true;

                }
            }
        }

        for(int i =2;i<arr.length;i++){
            if(!arr[i]){
                count++;
            }
        }

        return count;




        
    }
}