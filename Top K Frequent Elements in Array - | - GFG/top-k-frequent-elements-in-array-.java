//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public int[] topK(int[] a, int k) {
        // Code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        int[] ans=new int [k];
        
        for(int i=0;i<a.length;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1 );
        }
        
        // System.out.println(map);//its working great.
        
        //now create own custom comparator
        
        // Comparator comp=new Comparator(){
            
        // }

        TreeMap<Integer, Integer> sortedMap = new TreeMap<>((key1, key2) -> {
            int valueComparison = map.get(key2).compareTo(map.get(key1));

            if (valueComparison != 0) {
                // Values are different
                return valueComparison;
            } else {
                // Values are equal, compare keys in descending order
                return key2.compareTo(key1);
            }
        });        

        sortedMap.putAll(map);
        // System.out.println(sortedMap);//its working great.
        
        int i=0;
        
        //now fill the ans array
        for(Map.Entry<Integer,Integer> entry: sortedMap.entrySet() ){
            
            if(k==i)
                return ans;
            
            ans[i++]= entry.getKey();
            
        }
        
        
        //     ans[i]=sortedMap.
        // for(int i=0;i<k;i++){
        // }
        
        
        
        
        return ans;
        
    }
}