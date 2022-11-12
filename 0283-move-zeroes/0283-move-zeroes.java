class Solution {
    public void moveZeroes(int[] arr) {
        int cz=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) 
                cz++;
        }
        int x=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                arr[x++]=arr[i];
        }
        int i=0;
        while(i<arr.length && arr[i]!=0 ){
            i++;
        }
        int j=arr.length-1;
        while(cz>0){
            arr[j--]=0;
            cz--;
        }
    }
}