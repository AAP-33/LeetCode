class Solution {
    public int search(int[] arr, int target) {
        int h=arr.length-1,l=0;
        
        while(l<=h){
            int m=l+(h-l)/2;
            if(arr[m]==target)
                return m;
            else if(target<arr[m])
                h=m-1;
            else
                l=m+1;
        }
        
        return -1;
    }
}