class Solution {
    public int countKDifference(int[] nums, int k) {
        // List<Integer> al=new ArrayList<>();
//         Map<Integer,Integer> hm=new HashMap<>();
        int count=0;
        
//         for(int ele:nums){
//             hm.put(ele,1+hm.getOrDefault(ele,0));
//         }
//             System.out.println(hm);
//         for(int ele:nums)
//         {
//             count+=hm.getOrDefault(Math.abs(ele-k),0);
//             hm.remove(Math.abs(ele-k));
//             count+=hm.getOrDefault(Math.abs(ele+k),0);
//             hm.remove(Math.abs(ele+k));
            
            
//         }
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k) count++;
            }
        }
        
        
        
        
        return count;
    }
}