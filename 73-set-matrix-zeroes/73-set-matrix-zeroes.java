class Solution {
    class pair{
        public int i,j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    
    public void setZeroes(int[][] matrix) {
        
        ArrayList<pair> al=new ArrayList<pair>();
        
        // int threshold=0;
        int c=0;
        // int flag=0;
        // threshold=(matrix.length > matrix[0].length) ? matrix.length  : matrix[0].length ; 
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                // if(c>threshold) {
                //     flag=1;
                //     break;
                // }
                
                if(matrix[i][j]==0) {
                    c++;
                    pair zero=new pair(i,j);                    
                    al.add(zero);
                }
                
            }
        }
        
        
        // if(flag==1){
        //     for(int i=0;i<matrix.length;i++){
        //         for(int j=0;j<matrix[i].length;j++){
        //             matrix[i][j]=0;
        //         }
        //     }
        
    
            for(pair p:al){
                
                for(int i=0;i<matrix.length;i++){
                    matrix[i][p.j]=0;
                }
                for(int j=0;j<matrix[0].length;j++){
                    matrix[p.i][j]=0;
                }
            }
            
            
        }
        
    
}