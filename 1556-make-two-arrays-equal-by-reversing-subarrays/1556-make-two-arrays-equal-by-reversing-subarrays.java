class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr); Arrays.sort(target);
        for(int i=0; i<arr.length; i++){
            if(target[i] != arr[i]) return false;
        }
        return true;


//        Another solutions  0(N)

        // int[] temp = new int[1001]; 
        // for(int i=0; i<target.length; i++) {
		//    temp[target[i]]++;  temp[arr[i]]--; 
	    // }
	    // for(int i : temp) {
		//    if(i != 0) return false; 	
    	// }
        // return true;
    }
}