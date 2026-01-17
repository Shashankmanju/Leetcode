class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
         ans[0]=findFirst(nums,target);
         ans[1]=findLast(nums,target);

        return ans;
    }

    public int findFirst(int nums[],int target){
        int index=-1;
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target){
                index=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return index;
    }

    public int findLast(int nums[],int target){
        int index=-1;
        int left=0;
        int right=nums.length-1;
      

        while(left<=right){
              int mid=(left+right)/2;
            if(nums[mid]==target){
                index=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }

            }
            return index;
        }
    
    }
   

