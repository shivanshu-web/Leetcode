class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int j = 0;
            while(nums1[i]!=nums2[j]){
                j++;

            }
            boolean t = true;
            for(int k=j+1;k<nums2.length;k++){
                if(nums1[i]<nums2[k]){
                    arr[i] = nums2[k];
                    t = false;
                    break;
                }
            }
            if(t){
                arr[i] = -1;
            }
        }
        return arr;
        

    }
}