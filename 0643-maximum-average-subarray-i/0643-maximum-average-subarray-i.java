class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int left = 0;
        int right = k - 1;
        int currSum = windowSum;
        while (right + 1 < nums.length) {

            right++;

            currSum = currSum + nums[right] - nums[left];
            windowSum = Math.max(currSum, windowSum);

            left++;

        }

        double result = (double) windowSum / k;
        return result;

    }
}