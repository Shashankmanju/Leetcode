class Solution {
    public int splitArray(int[] nums, int k) {
        int left=getMax(nums);
        int right=getSum(nums);
        int result=0;
        while(left<=right){
            int mid=(left+right)/2;
            if(canSplit(nums,k,mid)){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }

    private int getSum(int nums[]){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }

    private int getMax(int nums[]){
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        return max;
    }

    private boolean canSplit(int nums[],int k,int mid){
        int subarray=1;
        int currentSum=0;
        for(int num:nums){
            if(num+currentSum>mid){
                subarray++;
                currentSum=num;
            }else{
                currentSum+=num;
            }
        }
        return subarray<=k;
    }
}