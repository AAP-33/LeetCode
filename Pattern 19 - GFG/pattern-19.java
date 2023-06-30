//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        //0->n        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");    
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");    
            }
            for(int j=i;j<n;j++){
                System.out.print("*");    
            }
            System.out.println();
        }

        //n->2n
        for(int i=n,k=1;i<2*n;i++,k++){
            
            for(int j=0;j<k;j++){
                System.out.print("*");    
            }
            
            for(int j=2*(n-k);j>0;j--){
                System.out.print(" ");    
                
            }
            
            for(int j=0;j<k;j++){
                System.out.print("*");    
                
            }
            System.out.println();
            
            


        }
        
    }
}