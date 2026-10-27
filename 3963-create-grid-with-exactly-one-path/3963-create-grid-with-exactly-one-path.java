class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];

        if (m == 1) {
            String row = "";
            for (int j = 0; j < n; j++) {
                row += ".";
            }
            ans[0] = row;
            return ans;
        } 
        else if (n == 1) {
            for (int i = 0; i < m; i++) {
                ans[i] = ".";
            }
            return ans;
        } 
        else {
            for (int i = 0; i < m; i++) {
                String row = "";

                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == n - 1) {
                        row += ".";
                    } else {
                        row += "#";
                    }
                }

                ans[i] = row;
            }
        }

        return ans;
    }
}