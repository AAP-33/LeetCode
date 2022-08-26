class Solution {
    public boolean containsDuplicate(int[] nums) {
        List<Integer> vis=new ArrayList<>();
    //TLE     
//         for(int ele:nums){
//             if(vis.contains(ele)) 
//                 return true;
//             vis.add(ele);
            
//         }
//         return false;
        int cur=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if(i==0) 
            {
                cur=nums[0];
                continue;
            }
            if(cur==nums[i]) 
                return true;
            else {
                cur=nums[i];
            }
        }
        
        return false;
    }
    
}