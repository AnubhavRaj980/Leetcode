class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        boolean f[][] = new boolean[r][c];
        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(matrix[i][j] == 0)
                {
                    for(int k = 0;k<r;k++)
                    {
                        f[k][j] = true;
                    }
                    for(int k = 0;k<c;k++)
                    {
                        f[i][k] = true;
                    }
                }
            }
        }

        for(int i = 0;i<r;i++)
        {
            for(int j = 0;j<c;j++)
            {
                if(f[i][j] == true)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}