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
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        
        ArrayList<Long> ans=new ArrayList<>();
        
        Long fact=1L;
        ans.add(fact);
        
        long i=2L;
        
        while(fact<=N){
            fact=factorial(i);
            i++;
            if(fact>N)
                break;
            ans.add(fact);
        }
        return ans;
    }
    
    static Long factorial(long n){
        if(n==2)
            return 2L;

        return n*factorial(n-1);
    }
}