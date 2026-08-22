class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        int right = 0;
        int left = 0;
        int len = 0;

        int validW = 0;

        while (right < n) {
            if (left == 0) {
                validW = (right - left + 1) - prefix[right];
            } else {
                validW = (right - left + 1) - (prefix[right] - prefix[left - 1]);
            }
            while (validW > k) {
                left++;
                if (left == 0) {
                    validW = (right - left + 1) - prefix[right];
                } else {
                    validW = (right - left + 1) - (prefix[right] - prefix[left - 1]);
                }
                

            }

            len = Math.max(len, right - left + 1);
            right++;

        }

        return len;

    }
}