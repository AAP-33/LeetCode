class Solution {
    public int search(int[] arr, int t) {
        
        int l=0,h=arr.length-1;
        
        if(arr[l]==t)
            return l;
        if(arr[h]==t)
            return h;
        
            int mid=0;
        while(l<=h){
        
            mid=(l+h)>>>1;
            // mid=l+(h-l)/2;
            if(arr[mid]==t) return mid;
            
            else if(arr[l]<=arr[mid] ){  //left wala part sorted hai
                if(t>=arr[l] && t<arr[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            else {                      //right wala part sorted hai
                if(t>arr[mid] && t<arr[h]){
                    l=mid+1;
                }else{
                    h=mid-1;
                }
            }
            // System.out.println(mid);
        }
        return -1;
    }
}