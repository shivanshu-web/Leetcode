class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[left] = nums[i];
                left++;
            }else if(nums[i]>pivot){
                arr[right]= nums[i];
                right--;
            }
        }

        int right2 = nums.length-1;
        
        while(left<=right2){
            if(left<=right){
                arr[left] = pivot;
                left++;
            }else{
                int temp = arr[right2];
                 arr[right2] = arr[left];
                 arr[left] = temp;
                 left++;
                 right2--;

            }

        }
        return arr;

       

        
    }
}