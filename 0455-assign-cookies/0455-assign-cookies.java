class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        int count=0;

        while(i< g.length && j< s.length){
            if(g[i]<=s[j]){
                i++;
                
                count++;
    
            }
            j++;
        }
        return count;
    }
}

/*
g = [1,2,3]
s = [1,1]
i=0, j=0 → 1<=1 ✅ → i=1, j=1, count=1

i=1, j=1 → 2<=1 ❌ → i stays, j=2

j >= s.length → exit loop

Return count = 1 ✅
*/