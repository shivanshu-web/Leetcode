class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length()==0){
            return "";
        }
        String word = strs[0];
        String res = "";
        int len = strs[0].length();
        for(int i=1;i<strs.length;i++){
            len = Math.min(len,strs[i].length());
            
        }


        for(int i =0; i<len;i++){
            boolean flow = true;
            for(int j=1; j<strs.length;j++){
                if(strs[j].charAt(i) != word.charAt(i)){
                    flow = false;
                    return res;
                    
                }
               



            }
             if(flow){
                    res += word.charAt(i);
                }
        }
        return res;
        
    }
}