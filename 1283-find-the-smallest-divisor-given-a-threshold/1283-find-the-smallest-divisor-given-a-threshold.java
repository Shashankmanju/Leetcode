class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=0;
        int right=getMax(nums);
        int result=0;

        while(left<=right){
            int mid=(left+right)/2;

            if(canDivide(mid,nums,threshold)){
                right=mid-1;
                result=mid;
            }else{
                left=mid+1;
            }
        }
        return result;
    }


        private int getMax(int[] nums){
            int maxCount=0;
            for(int num:nums){
                maxCount=Math.max(maxCount,num);
            }
            return maxCount;
        }

        private boolean canDivide(int mid,int[] nums, int threshold){
            int sum=0;
            for(int num:nums){
                sum+=Math.ceil((double)num/mid);
            }
            return sum<=threshold;
        }
}
    
