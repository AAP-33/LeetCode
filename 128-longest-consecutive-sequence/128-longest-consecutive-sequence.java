class Solution {
    public int longestConsecutive(int[] arr) {
        
      int n=arr.length;
        if(n==0) return 0;
	    Arrays.sort(arr);
	    Set<Integer> a=new LinkedHashSet<Integer>();
	    for(int ele:arr)
    	    a.add(ele);
	    int j=0;
	    for(int e:a){
	        arr[j++]=e;
	    }
	    
	   // arr=a.toArray(arr);
	    
	    int s=0;
	    int c=0;
	   // add your code here
	   for(int i=0;i<n-1;i++){
	       if(arr[i]+1==arr[i+1])
	            c++;
	        else
	            c=0;
	       if(s<=c)
	            s=c;
	   }
	   return s+1;
	   
	   //new method is applicable if e count duplicate as well 
	   
	    
	   // Arrays.sort(arr);
	   // int s=0;
	   // int c=0;
	   //// add your code here
	   //for(int i=0;i<n-1;i++){
	   //    if(arr[i]+1==arr[i+1] || arr[i]==arr[i+1])
	   //         c++;
	   //     else
	   //         c=0;
	   //    if(s<=c)
	   //         s=c;
	   //}
	   //return s+1;
	
    }
}