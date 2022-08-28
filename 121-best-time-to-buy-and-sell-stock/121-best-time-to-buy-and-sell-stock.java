class Solution {
    public int maxProfit(int[] ar) {
    
        int mp=0;   //maximum profit
        int msf=ar[0];   //minimum so far
        for(int i=1;i<ar.length;i++){
            if(ar[i]<msf){
                msf=ar[i];
            }else{
                mp= (ar[i]-msf)>mp ? (ar[i]-msf) :mp ;
            }
        }
        return mp;  
    }
}