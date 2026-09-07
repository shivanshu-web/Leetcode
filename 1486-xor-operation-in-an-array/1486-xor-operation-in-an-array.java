class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        arr[0] = start;
        int val = start;
        for(int i = 1;i<n;i++){
            arr[i] = start +2*i;
            val = val^arr[i];

        }
        return val;
        

    }
}