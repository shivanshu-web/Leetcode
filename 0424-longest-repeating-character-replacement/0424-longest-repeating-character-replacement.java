class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        int len = s.length();
        int maxlen = 0;

        while (right < len) {
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;

            }

            maxlen = Math.max(maxlen,right-left+1);
            right++;

        }

        return maxlen;

    }
}