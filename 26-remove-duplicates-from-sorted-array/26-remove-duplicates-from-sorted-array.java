class Solution {
    public int removeDuplicates(int[] a) {

        int k=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1] )
            {
                a[k++]=a[i+1];
            } 
        }
        return k;
    }
}