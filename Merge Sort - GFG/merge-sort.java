//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int h)
    {
         // Your code here
        
        int left=l;
        int right=m+1;
        
        ArrayList<Integer> temp=new ArrayList<>();
        // int k=l;
        
        while(left<=m && right<=h){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        } 
        
        while(left<=m){
            temp.add(arr[left++]);
        }
         
        while(right<=h){
            temp.add(arr[right++]);
        }
         
         
        for(int i=l;i<=h;i++){
            arr[i]=temp.get(i-l);
        }
         
    }
    void mergeSort(int arr[], int l, int h)
    {
        //code here
        
        if(l>=h)return;
        
        int m= l + (h-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,h);
        merge(arr,l,m,h);
        
        
    }
}
