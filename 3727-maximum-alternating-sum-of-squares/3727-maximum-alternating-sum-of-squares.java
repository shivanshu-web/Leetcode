class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] arr = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long num = (long)Math.pow(nums[i], 2);
            arr[i] = num;

        }
        Arrays.sort(arr);
        long sum = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            sum += (long)(arr[right] - arr[left]);
           
            left++;
            right--;

        }
        if(arr.length%2 !=0){
            int num = arr.length/2;
            sum += arr[num];
        }

        return sum;

    }
}