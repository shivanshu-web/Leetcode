// class Solution {
//     public String digitSum(String s, int k) {


//         while(s.length()>k){
//             String temp = "";
//             int count = 1;
//             int sum = 0;
//             for(int i =0;i<s.length();i++){
//                 sum += s.charAt(i)-'0';
                
//                 if(count ==k ){
//                     temp = temp + sum;
//                     count = 0;
//                     sum = 0;
//                 }
//                 count++;
                
//             }
//             if(s.length()%k==0){
//                 s = temp;

//             }else{
//                 temp = temp + sum;
//                 s = temp;


//             }
            
            


//         }
//         return s;
        
//     }
// }

class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';

                if (count == k) {
                    temp.append(sum);
                    count = 0;
                    sum = 0;
                }
                count++;
            }

            if (s.length() % k == 0) {
                s = temp.toString();
            } else {
                temp.append(sum);
                s = temp.toString();
            }
        }

        return s;
    }
}