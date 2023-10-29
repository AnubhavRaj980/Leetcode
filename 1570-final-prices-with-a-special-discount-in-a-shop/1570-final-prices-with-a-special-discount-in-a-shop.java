class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack();
        int[]arr= new int[prices.length];
        int ind=arr.length-1, rev=prices.length-1;
        
        while(rev >=0 ) {
            if(st.isEmpty()) {
                arr[ind]=prices[rev]; 
                ind--; 
                st.push(prices[rev]);}
            else if(!st.isEmpty() && st.peek()<=prices[rev]){
                arr[ind]=prices[rev]-st.peek();
                ind--;
                st.push(prices[rev]);
            }
            else if (!st.isEmpty() && st.peek()>prices[rev]){
                while(st.peek()>prices[rev])
                {
                    st.pop();
                    if(st.isEmpty() ) {
                    arr[ind]=prices[rev]; 
                    ind--;
                    st.push(prices[rev]);
                    break;}
                    else if(st.peek()<=prices[rev]) {
                        arr[ind]=prices[rev]-st.peek(); 
                        ind--;
                        st.push(prices[rev]);
                        break;
                    }
                }
            }
            
            rev--;
        }
        return arr;
    }
}