class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right && !Character.isLetter(arr[left])){
                left++;
            }
            while(left < right && !Character.isLetter(arr[right])){
                right--;
            }
            if(left>=right){
                break;
            }
            char temp = arr[left];
            arr[left]  = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str = new String(arr);
        return str;


    
        
    }
}