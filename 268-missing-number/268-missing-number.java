class Solution {
    public int missingNumber(int[] arr) {
        
        int n=arr.length;
        int ans=n;
        
        for(int i=0;i<n;i++){
            if(arr[i]==arr.length)
                continue;
            else{
                while(arr[i]!=arr.length &&arr[i]!=i){
                    swap(arr,i,arr[i]);
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            if(arr[i]!=i)
                return i;
        }
        
        return ans;
        
    }
    public void swap(int nums[],int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}