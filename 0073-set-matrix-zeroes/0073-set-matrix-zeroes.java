class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[][] vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // check whether it is previous zero or modified zero
                if(matrix[i][j]==0 && vis[i][j]==false){
                    fill(i,j,matrix,vis);
                }
            }
        }
    }
    public void fill(int x,int y,int[][] mat,boolean[][] vis){
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            if(mat[i][y]!=0){
                mat[i][y]=0;
                // for not disturbing the previous zeroes in matrix
                vis[i][y]=true;
            }
        }
        for(int j=0;j<m;j++){
            if(mat[x][j]!=0){
                mat[x][j]=0;
                vis[x][j]=true;
            }
        }
    }
}