// class Solution {
//     public int getMaxLen(int[] nums) {
//         int start = 0;
        
//         int maxL = 0;
//         int allvalid = 0;
//         int allnegative = 0;
//         int FN = -1;
//         int LN =-1;
//         int right = start;

       
//         while(right<nums.length){
//             while(nums[start]==0){
//                 start++;
//                 right = start;
//             }
             
//             if(nums[right]==0){
//                 int l = right-start;
//                 if(allnegative%2==0){
//                     maxL = Math.max(l,maxL);
//                 }else{
//                     int FirstN = right-FN-1;
//                     maxL = Math.max(maxL,FirstN);
//                     int lastN = LN-start;
//                     maxL = Math.max(maxL,lastN);
//                 }
//                  int allnegative = 0;
//                  int FN = -1;
//                  int LN =-1;
//                  if(right<nums.length-1){
//                     start = right+1;
                    
//                  }


                

//             }
//             if(right == nums.length-1){
//                  if(allnegative%2==0){
//                     maxL = Math.max(l,maxL);
//                 }else{
//                     int FirstN = right-FN-1;
//                     maxL = Math.max(maxL,FirstN);
//                     int lastN = LN-start;
//                     maxL = Math.max(maxL,lastN);
//                 }
//                  int allnegative = 0;
//                  int FN = -1;
//                  int LN =-1;}

//             }
//             if(nums[right]<0&&FN<0){
//                 FN = right;
//                 LN = right;
//                 allvalid++;
//                 allnegative++;
//             }else if(nums[right]<0){
//                 LN=right;
//                 allvalid++;
//                 allnegative++;
            
//             }
            
           


    
            
//             right++;


//         }
//         return maxL;

        
//     }
// }


class Solution {
    public int getMaxLen(int[] nums) {

        int start = 0;
        int maxL = 0;
        int allnegative = 0;
        int FN = -1;
        int LN = -1;

        int right = 0;

        while (right < nums.length) {

            if (nums[right] < 0) {
                if (FN == -1) {
                    FN = right;
                }

                LN = right;
                allnegative++;
            }

            if (nums[right] == 0) {

                int l = right - start;

                if (allnegative % 2 == 0) {
                    maxL = Math.max(maxL, l);
                } else {
                    int firstN = right - FN - 1;
                    int lastN = LN - start;

                    maxL = Math.max(maxL,
                            Math.max(firstN, lastN));
                }

                allnegative = 0;
                FN = -1;
                LN = -1;

                start = right + 1;
            }

            right++;
        }

        // Process the final segment
        int l = nums.length - start;

        if (allnegative % 2 == 0) {
            maxL = Math.max(maxL, l);
        } else {
            int firstN = nums.length - FN - 1;
            int lastN = LN - start;

            maxL = Math.max(maxL,
                    Math.max(firstN, lastN));
        }

        return maxL;
    }
}

