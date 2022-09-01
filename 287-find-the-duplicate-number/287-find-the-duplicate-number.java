class Solution {
    public int findDuplicate(int[] a) {
    
        for(int i=0;i<a.length;i++){
            if( a[Math.abs(a[i])] < 0 ) return Math.abs(a[i]);
            a[Math.abs(a[i])]*=-1;
        }
        
                                                
        return 0;
    }
}