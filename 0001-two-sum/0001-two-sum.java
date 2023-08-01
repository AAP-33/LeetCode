class Solution {
    public int[] twoSum(int[] arr, int target) {
        Map<Integer,Integer> temp=new HashMap<>();
        int []ans=new int[2];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int req=target-arr[i];
            if(temp.containsKey(req)){
                ans[0]=i;
                ans[1]=temp.get(req);
            }
            temp.put(arr[i],i);
            
        }

        return ans;
    }
}