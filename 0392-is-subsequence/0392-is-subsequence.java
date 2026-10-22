class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length() ){
            return false;
        }else if(s.length()==0){
            return true;
        }

        int sl = 0;
        int tl =0;
        while(true){
            if(s.charAt(sl)==t.charAt(tl)){
                sl++;
                tl++;
            }else{
                tl++;
            }
            if(sl>=s.length()){
                return true;
            }else if(tl>=t.length()){
                return false;
            }
            

        }
        

        
    }
}