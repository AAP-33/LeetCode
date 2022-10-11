class Solution {
    public int numberOfSteps(int num) {
        int ans=helper(num,0);
        return ans;
    }
    
    public int helper(int n,int c){
        
        if(n==0)
            return c+0;
        else if((n&1)==0)
            return helper(n>>1,c+1); 
        else {
            return helper(n-1,c+1);
        }
    }
    
}