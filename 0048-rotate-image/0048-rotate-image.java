class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=t;
            }
        }
        //now mirror image ..

        int col1=0, col2=n-1;
        while(col1<col2){
            for(int i=0;i<n;i++){
                int t=mat[i][col1];
                mat[i][col1]=mat[i][col2];
                mat[i][col2]=t;
            }
            col1++;
            col2--;
        }
    }
}