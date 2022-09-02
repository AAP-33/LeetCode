class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        for(int ele:nums)
        {
                int elem=Math.abs(ele);
                
                if(  nums[elem-1]<0) res.add(elem);
                nums[elem-1]*=-1;
        }
        
        return res;
    }
}