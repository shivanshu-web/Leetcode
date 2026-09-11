class Solution {
    public String countAndSay(int n) {
       
        
        String result = "1";

        for(int i = 2;i<=n;i++){
            StringBuilder  temp = new StringBuilder("");
            int count = 1;
            char val = result.charAt(0);
            int l =0;
            while(l<result.length()-1){
                if(result.charAt(l) == result.charAt(l+1)){
                    
                    count++;
                    
                }else{
                  
                    temp.append(count);
                    temp.append(val);
                    val = result.charAt(l+1);
                    count = 1;
                }
                l++;

            }
            temp.append(count);
            temp.append(val);
           
            result = temp.toString();


        }
        return result;

        
    }
}