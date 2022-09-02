class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        
        Map<Integer,Integer> map=new HashMap<>();
        //ye daalna jaruri hai so that 3,2 will be = 5 and 5-5=0 (k=5)so isse pehle zero ek baar aaya hai vo daalna padega taaki ye count ho 
        map.put(0,1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1 );
        }
        
        
        
        
        
        
        return count;
    }
}