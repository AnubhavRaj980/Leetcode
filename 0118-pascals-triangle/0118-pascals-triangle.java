class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                row.add(1);
                if(j == i) break;
                if(j > 0 && j < i){
                    int a = res.get(i - 1).get(j - 1);
                    
                    int b = res.get(i - 1).get(j);
                    System.out.println(a+" "+b);
                    row.set(j, a + b );
                }

            }
            res.add(row);
        }
        return res;
    }
}