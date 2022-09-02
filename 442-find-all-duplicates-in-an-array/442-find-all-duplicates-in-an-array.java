class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList();
        // Set<Integer> hs=new HashSet<>();
        
//         for(int ele:nums){
//             if(hs.contains(ele)){
//                 res.add(ele);
//             }else{
//                 hs.add(ele);
//             }
//         }
        
        for(int ele:nums)
        {
                int elem=Math.abs(ele);
            // if(elem!=nums.length){
                
                if(  nums[elem-1]<0) res.add(elem);
                else
                    nums[elem-1]*=-1;
            // }
        }
        
        return res;
    }
}