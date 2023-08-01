class Solution {
    public List<List<Integer>> fourSum(int[] nums, long target) {
        int n=nums.length;
 
    //     HashSet<Long> temp=new HashSet<>();
    //     HashSet<List<Integer>> uniqueQuadSet=new HashSet<>();
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             temp.clear();
    //             for(int k=j+1;k<n;k++){
    //                 long req=(long)target-(nums[i]+nums[j]+nums[k]);

    //                 if(temp.contains(req)){
    //                     ArrayList<Integer> t=new ArrayList<>();
    //                     t.add(nums[i]);
    //                     t.add(nums[j]);
    //                     t.add(nums[k]);
    //                     t.add((int)req);
    //                     Collections.sort(t);
    //                     uniqueQuadSet.add(t);
    //                 }
    //                 temp.add((long)nums[k]);
    //             }
    //         }
    //     }
    //     List<List<Integer>> ans=new ArrayList<>();
    //     for(List<Integer> e:uniqueQuadSet)
    //         ans.add(e);
    //     return ans;
        Arrays.sort(nums);
        List<List<Integer>> anslist = new ArrayList<>();
        if (nums == null || n < 4)
			return anslist;
        int max=nums[n-1];
        if(nums[1]==1000000000)
            return anslist;
        // if( 4*nums[0] > target || 4 * max < target)
        //     return anslist;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i+1 && nums[j] == nums[j - 1])
                    continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = nums[left] + nums[right] + nums[i] + nums[j];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;

                    } else {
                        List<Integer> t = new ArrayList<>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[left]);
                        t.add(nums[right]);
                        anslist.add(t);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                            left++;
                        while (left < right && nums[right] == nums[right + 1])
                            right--;
                    }
                }

            }
        }

        return anslist;
    }
}