class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=0;
        int right=getMax(piles);
        int result=0;

        while(left<=right){
            int mid=(left+right)/2;

            if(canEat(piles,mid,h)){
                result=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return result;
    }

    private int getMax(int piles[]){
        int max=0;
        for(int pile:piles){
        max=Math.max(max,pile);
        }
        return max;
    }

    private boolean canEat(int[] piles,int mid,int h){
        int hoursNeeded=0;
        for(int pile:piles){
            hoursNeeded+=Math.ceil((double)pile/mid);
        }
        return hoursNeeded<=h;
    }
}