class Solution {
    public int maximum69Number (int num) {
        StringBuilder s = new StringBuilder("");
        String sn = num + "";

        
        for(int i = 0;i<sn.length();i++){
            if(sn.charAt(i)=='6'){
                s.append('9');
                for(int j = i+1;j<sn.length();j++){
                    s.append(sn.charAt(j));
                }

                return Integer.parseInt(s.toString());

            }
            s.append(sn.charAt(i));
            
        }
        return Integer.parseInt(s.toString());
        
    }
}