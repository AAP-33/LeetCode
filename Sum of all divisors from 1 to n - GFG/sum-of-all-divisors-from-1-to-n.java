//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int n){
        // code here
        long ans=0;
        for(int i=1;i<=n;i++){
            // ans+=sumOfThatDivisor(i);
            ans+=n/i*i;
        }
        return ans;
    }
    
    
    static long sumOfThatDivisor(int n){
        
        if(n==1)
            return 1;

        long ans=0;
        for(int i=1;i<=n;i++){
            // if(n%i==0)
            // {
            //     // int countPSq=0;
                
            //     ans+=n/i;
            //     int temp=(int)Math.sqrt(n);
                
            //     if(temp*temp!=n){
            //         ans+=i;
                    
            //     }else{
            //         // countPSq++;
            //         if(i!=1)
            //             ans+=1;
            //         // System.out.println("count:"+countPSq+" i:"+i);
            //     }
            //         // ans+=countPSq;
                
                
            // }
            
            int div= n/i;
            ans+=((n/i)*i);
            // ans+=((n/i)*i);
        }
                
        return ans;
    }
}