//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] a){
    //     // your code here
    //     int jump=0;
    //     int i=0;
        
    //     while(i<a.length){
    //         int maxidx=maxWithinRange(a,i,a[i]);
    //         // System.out.println("maxidx:"+ maxidx);
    //         i=i+maxidx;
    //         if(i>=a.length-1)
    //             return jump;
    //         // System.out.println("element I'm currently at:"+ a[i]);
            
    //         jump++;
            
            
    //         if(a[i]==0)
    //             return -1;
    //     }
    //     // if(a[a.length-1]==a[i])
    //         return jump;
            
    // }
    
    
    // static int maxWithinRange(int[] a,int b,int e){
    //     if(b==e)
    //         return a[b];
    //     int mIdx=b;
    //     int i=b;
    //     while(i<=e&& i<=a.length-1){
    //         if(a[i]>a[mIdx])
    //             mIdx=i;
    //         i++;
    //     }
    //     // if(b+mIdx>)
    //     return mIdx;
    // }
    
    //TLE
    
    int n=a.length;
    
    if(a.length==1)
        return 0;
    if(a[0]==0)
        return -1;
    
    int maxReach=a[0];
    int jumps=1;
    int step=a[0];
    
    for(int i=1;i<n;i++){
        if(i==n-1)
            return jumps;
            
        maxReach=Math.max(maxReach,i+a[i]);
        step--;
        if(step==0){
            jumps++;
            if(i>=maxReach)
                return -1;
            step=maxReach-i;
        }
        
    }
    return -1;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}