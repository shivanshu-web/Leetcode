class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;

        int len = Integer.MAX_VALUE;
        String best = "";

        while (right < s.length()) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Too many 1s → shrink
            while (map.getOrDefault('1', 0) > k) {
                char c = s.charAt(left);
                map.put(c, map.get(c) - 1);
                left++;
            }

            // Exactly k 1s
            if (map.getOrDefault('1', 0) == k) {

                // Remove unnecessary leading zeros
                while (s.charAt(left) == '0') {
                    char c = s.charAt(left);
                    map.put(c, map.get(c) - 1);
                    left++;
                }

                String candidate = s.substring(left, right + 1);

                // Shorter OR same length but lexicographically smaller
                if (candidate.length() < len ||
                    (candidate.length() == len &&
                     candidate.compareTo(best) < 0)) {

                    len = candidate.length();
                    best = candidate;
                }
            }

            right++;
        }

        return best;
    }
}