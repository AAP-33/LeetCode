class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        int n=arr.length;
        // HashSet<Integer> temp=new HashSet<>();
        // HashSet<List<Integer>> set=new HashSet<>();

        // for(int i=0;i<n;i++){
        //     temp.clear();
        //     for(int j=i+1;j<n;j++){
        //         int third=-(arr[i]+arr[j]);
        //         if(temp.contains(third)){
        //             List<Integer> a=new ArrayList<>();
        //             a.add(arr[i]);a.add(arr[j]);a.add(third);
        //             Collections.sort(a);
        //             set.add(a);
        //         }
        //         temp.add(arr[j]);
        //     }
        // }

        // List<List<Integer>> anslist=new ArrayList<>();
        // for(List<Integer> e:set){
        //     anslist.add(e);        

        // }
        // return anslist;

        List<List<Integer>> anslist=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){

                if(arr[i]+arr[l]+arr[r]<0){
                    l++;
                }else if(arr[i]+arr[l]+arr[r]>0){
                    r--;
                }else {
                    List<Integer> list=new ArrayList<>();
                     list.add(arr[i]);
                     list.add(arr[l]);
                     list.add(arr[r]);
                     anslist.add(list);
                     l++; r--;
                     while(l<r && arr[l]==arr[l-1]) l++;
                     while(l<r && arr[r]==arr[r+1]) r--;

                }
            }
        }
        return anslist;


    }
}