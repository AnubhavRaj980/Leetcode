class Solution {
    public boolean divideArray(int[] nums) {
        int temp[] = new int[1000];
        for(int i : nums) temp[i]++;
        for(int i=0; i<temp.length; i++){
            if(temp[i]%2!=0) return false;
        }
        return true;

//        USING HASHMAP

        // Map<Integer,Integer> temp = new HashMap<>();
        // for(int i : nums) temp.put(i,temp.getOrDefault(i,0)+1);
        
        // for(int i : temp.keySet()){
        //     if(temp.get(i)%2!=0) return false; 
        // }
        // return true;
    }
}