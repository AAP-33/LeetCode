class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0;
        int p2=0;
        int k=0;
        int[] res=new int[m+n];
        
        while(p1<m && p2<n){
            if(nums1[p1]>nums2[p2])
                res[k++]=nums2[p2++];
            else
                res[k++]=nums1[p1++];
        }

        while(p1<m){
                res[k++]=nums1[p1++];
        }
        while(p2<n){
                res[k++]=nums2[p2++];
        }
        int i=0;
        while(i<k){
            nums1[i]=res[i];
            i++;
        }
    }
}