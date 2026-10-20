class Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        str.append(s);
        int count = 0;
        String result = str.substring(0, 1);
        int i = 0;
        int left = i;
        int right = i;

        while (i < s.length()) {
            left = i;
             right = i;
           

            while((left >= 0 && right < s.length()) && (s.charAt(left) == s.charAt(right))) {

                
                    left--;
                    right++;
                

            }

            if (count < right - left - 1) {
                result = str.substring(left + 1, right);
                count = right - left - 1;
            }
             

             int l = i;
             int r = i+1;

             while((l >= 0 && r < s.length()) && (s.charAt(l) == s.charAt(r))) {
                l--;
                r++;
             }

              if (count < r - l - 1) {
                result = str.substring(l + 1, r);
                count = r - l - 1;
            }



            i++;

           

        }

        return result;

    }
}