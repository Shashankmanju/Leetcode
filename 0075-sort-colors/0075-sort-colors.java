class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right=nums.length-1;
        
        while(mid<=right){
            switch(nums[mid]){
                case 0:
                int temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                left++;
                mid++;
                break;


                case 1:
                mid++;
                break;


                case 2:
                 temp=nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
                break;
            }
        }
    }
}