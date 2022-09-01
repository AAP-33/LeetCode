class Solution {
    public int[] twoSum(int[] nums, int target) {
        //naive to n^2 hoga .. easy hai
        
        //trying optimal by myself..
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap();
        int []ans=new int[2];
        
        
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                // ans[0]=indexOf(hs,target-nums[i]);
                ans[0]=hm.get(target-nums[i]);
                ans[1]=i;
            }
            hm.put(nums[i],i);
        }
        return ans;
    }
    
//     public int indexOf(LinkedHashSet<Integer> hs,int x){
//         int index=0;
//         Iterator it=hs.iterator();
        
//         while(it.hasNext()){
//             if(it.next().equals(x)) 
//                 return index;
//             index++;
//         }
        
//         return -1;
//     }
    
}