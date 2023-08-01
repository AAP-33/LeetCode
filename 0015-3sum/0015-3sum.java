class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        HashSet<Integer> temp=new HashSet<>();
        HashSet<List<Integer>> set=new HashSet<>();

        for(int i=0;i<n;i++){
            temp.clear();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
                if(temp.contains(third)){
                    List<Integer> a=new ArrayList<>();
                    a.add(arr[i]);a.add(arr[j]);a.add(third);
                    Collections.sort(a);
                    set.add(a);
                }
                temp.add(arr[j]);
            }
        }

        List<List<Integer>> anslist=new ArrayList<>();
        for(List<Integer> e:set){
            anslist.add(e);        

        }
        return anslist;
    }
}