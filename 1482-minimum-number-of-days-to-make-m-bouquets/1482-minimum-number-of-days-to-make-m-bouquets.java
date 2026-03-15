class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left=0;
        int right=getMax(bloomDay);
        int result=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(canMake(bloomDay,m,k,mid)){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }

    private int getMax(int bloomDay[]){
        int max=0;
        for(int bloom:bloomDay){
            max=Math.max(max,bloom);
        }
        return max;
    }

    private boolean canMake(int[] bloomDay, int m, int k,int mid ){
        int count=0;
        int bouq=0;
        for(int bloom:bloomDay){
            if(bloom<=mid){
                count++;
                if(count==k){
                    bouq++;
                    count=0;
                }
            }else{
                count=0;
            }
        }
        return bouq>=m;
    }
}