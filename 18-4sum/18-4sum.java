class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        if(nums==null || nums.length==0 ||nums[0]==1000000000 || nums[0]==-1000000000 )
            return res;
        Arrays.sort(nums);
        
        int n=nums.length;
        
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++){
                int target_2=target-nums[i]-nums[j];
                
                int front=j+1,back=n-1;
                
                while(front<back){
                    int two_sum=nums[front]+nums[back];
                    if(two_sum<target_2)
                    {
                        front++;
                    }
                    else if(two_sum>target_2){
                        back--;
                    }
                    else{
                        List<Integer> quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);
                        
                        res.add(quad);
                        
                        while(front<back && nums[front]==quad.get(2)) front++;
                        while(front<back && nums[back]==quad.get(3)) back--;
                    }
                }
                //skip duplicates of number 2 ,means no. nums[j]
                while(j+1<n && nums[j+1]==nums[j]) j++;
            }
                //skip duplicates of number 1 ,means no. nums[i]
                while(i+1<n && nums[i+1]==nums[i]) i++;
        }
        
        
        
        
        return res;
    }
}