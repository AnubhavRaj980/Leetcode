class Solution {


      // this beats 80%
 /*   static int helper(int m, int n, int arr[][]){
        int a[][] = new int[m][n];

        for(int i=0; i<arr.length; i++){
            int r = arr[i][0];
            int c = arr[i][1];
            for(int j=0; j<n; j++){
                a[r][j]++;
            }

            for(int j=0; j<m; j++){
                a[j][c]++;
            }
        }

        int ans = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(a[i][j]%2!=0) ans++;
            }
        }

        return ans;

    }

    */
    public int oddCells(int m, int n, int[][] indices) {
        
        int[] rows = new int[m];
        int[] cols = new int[n];
        
        //rows
        for(int[] rc : indices) {
            rows[rc[0]]++;
            cols[rc[1]]++;
        }
        
        int oddRows = 0;
        for(int row : rows) {
            if(row % 2 == 1) {
                oddRows++;
            }
        }
        int oddCols = 0; 
        for(int col : cols) {
            if(col % 2 == 1) {
                oddCols++;
            }
        }
        
        int odds = (oddRows * n) + (oddCols * m); 
        int evensFromCrossOver = oddRows * oddCols; 
        if(odds > 0 && oddRows > 0 && oddCols > 0) {
			// Since the odds and evens are BOTH incremented, you need to decrement this count twice.
            odds = odds - (2 * evensFromCrossOver);  
        }
        
        return odds; 
    }
}