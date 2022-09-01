class Solution {
    public int maxProfit(int[] p) {
        int pro=0;
        for(int i=0;i<p.length-1;i++){
            if(p[i+1]>p[i]){
                pro+=(p[i+1]-p[i]);
            }
        }
        return pro;
    }
}