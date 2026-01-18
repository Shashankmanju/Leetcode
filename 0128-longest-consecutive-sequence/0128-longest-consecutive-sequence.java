class Solution {
    public int longestConsecutive(int[] nums) {
        int result=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int count=1;

                while(set.contains(currentNum+1)){
                    currentNum=currentNum+1;
                    count=count+1;
                }
                result=Math.max(result,count);
            }
        }
        return result;
    }
}