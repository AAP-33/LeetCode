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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        for(int i=1;i<=2*n-1;i++){
            // for(int j=1;j<=2*n-1;j++){
                // if(i==1||i==2*n-1)
                //     System.out.print(n+" ");
                // else if(j==1||j==2*n-1){
                //     System.out.print((n)+" ");
                        
                // }
                // // n-j+1 + (n-i)
                // else{
                //     System.out.print((n+1-i)+" ");
                // }
                // }
                
                for(int j=1;j<=2*n-1;j++){
                    int top=i;
                    int bottom=2*n-i;
                    int left=j;
                    int right=2*n-j;
                    
                    int result= n- Math.min(Math.min(top,bottom),Math.min(left,right));
                    
                    System.out.print( result +1 +" ");
                    
            }
            System.out.println();
        }
    }
}