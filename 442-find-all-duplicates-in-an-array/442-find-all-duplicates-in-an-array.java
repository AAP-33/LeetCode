class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        List<Integer> res=new ArrayList();
        
        for(int ele:nums){
            if(hs.contains(ele)){
                res.add(ele);
            }else{
                hs.add(ele);
            }
        }
        return res;
    }
}