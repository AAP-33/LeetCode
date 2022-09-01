class Solution {
    public int[] twoSum(int[] a, int t) {
        int s=0;
        int e=a.length-1;
        
        int []ans=new int[2];
        
        while(s<e){
            if(a[s]+a[e] > t)
            {
                e--;
            }
            else if(a[s]+a[e] < t){
                s++;
            }
            else{
                ans[0]=s+1;ans[1]=e+1;
                s++;e--;
            }
        }
        return ans;
    }
}