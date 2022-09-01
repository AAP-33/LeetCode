class Solution {
    public void sortColors(int[] a) {
        int x=0,y=0,z=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) x++;
            if(a[i]==1) y++;
            if(a[i]==2) z++;
        }
        for(int i=0;i<a.length;i++){
           if(x-->0) a[i]=0;
           else if(y-->0) a[i]=1;
            else a[i]=2;
        }
    }
}