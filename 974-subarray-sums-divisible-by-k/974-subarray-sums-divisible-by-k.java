class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0;
        int sum=0;
        //BRUTE FORCE N^2 GIVING TLE
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum%k==0) 
//                 {
//                     res++;
//                     // System.out.println();
//                 }
//             }
//             sum=0;
//         }
        
        //remainders ki frequency store karo map me
        int rem=0;
        Map<Integer,Integer> map=new HashMap();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            rem=sum%k;
            if(rem<0 ) rem+=k;
            
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        return count;
    }
}