import java.util.*;
class Solution {
    
    public boolean isPalindrome(String s) {
        int len = s.length()-1;
        String s1 ="";
        for(int i = 0; i<=len;i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                s1 += Character.toLowerCase(c);
            }

        }
        for(int i = 0; i<s1.length()/2;i++){
            
            if(s1.charAt(i)!= s1.charAt(s1.length()-1-i)){
                return false;
               
            }
        }

       return true;

        
    }
}