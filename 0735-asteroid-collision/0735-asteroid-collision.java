class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>st=new Stack<>();
        
        for(int asteroid:asteroids){
            boolean isAlive=true;
            while(!st.isEmpty()&& isAlive && asteroid<0 && st.peek()>0){
                
                int top=st.peek();
                if(top<-asteroid){
                    st.pop();

                }else if(top==-asteroid){
                    st.pop();
                    isAlive=false;
                }else{
                    isAlive=false;
                }
               
            }
             if(isAlive){
                    st.push(asteroid);
                }

    
    }
    int result[]=new int[st.size()];
         for(int i=result.length-1;i>=0;i--){
                result[i]=st.pop();
            }
        
    return result;
    }
}