class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        int n=arr.length;
        
        //a+b+c==0
        //let us choose a
        
        int a,b,c;
        a=b=c=0;
        Arrays.sort(arr);
        
        for(int i=0;i<n-2;i++){
            a=arr[i];
            if(i==0 || arr[i]!=arr[i-1]){
                //two 2 pointer for 2 sum == -a
                int s=i+1,e=n-1;
                 while(s<e){

                    if(arr[s]+arr[e] > -a)
                    {
                        e--;
                    }
                    else if(arr[s]+arr[e] < -a){
                        s++;
                    }
                    else{
                        List<Integer> bb=new ArrayList<Integer>();
                        bb.add(a);
                        bb.add(arr[s]);
                        bb.add(arr[e]);

                        while(s<e && arr[s]==arr[s+1]) s++;
                        while(s<e && arr[e]==arr[e-1]) e--;

                        ans.add(bb);

                        s++;e--;
                    }
                }
            }
        }
        return ans;
    }
}