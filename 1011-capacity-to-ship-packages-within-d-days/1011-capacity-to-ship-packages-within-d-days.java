class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=getMax(weights);
        int right=getSum(weights);
        int result=0;

        while(left<=right){
            int mid=(left+right)/2;

            if(noOfDays(weights,days,mid)){
                right=mid-1;
                result=mid;
            }else{
                left=mid+1;
            }
        }
        return result;
    }

    private int getSum(int[] weights){
        int sum=0;
        for(int weight:weights){
            sum+=weight;
        }
        return sum;
    }

    private int getMax(int weights[]){
        int maxNum=0;
        for(int weight:weights){
            maxNum=Math.max(maxNum,weight);
        }
        return maxNum;
    }

    private boolean noOfDays(int weights[],int days,int capacity){
        int load=0;
        int reqDays=1;
        for(int weight:weights){
            if(load+weight>capacity){
                reqDays++;
                load=weight;
            }else{
                load+=weight;
            }
        }
        return reqDays<=days;
    }
}