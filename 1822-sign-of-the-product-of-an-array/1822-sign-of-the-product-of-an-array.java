class Solution {
    public int arraySign(int[] nums) {
        
        int prod=1;
        for(int ele:nums){
            if(ele==0)
                return 0;
            else if(ele>0)
                continue;
            else{
                prod*=-1;
            }
            // prod*=ele;
        }
        
        
        if(prod>0)
        {
            prod=1;
            return 1;
        }
        else if(prod<0) {
            prod=1; 
            return -1;
        }
        
        else{
            prod=1;
            return 0;
        }
            
        
        //(prod>0) ? (return 1) : (prod <0? return -1 : 0 );
    }
}