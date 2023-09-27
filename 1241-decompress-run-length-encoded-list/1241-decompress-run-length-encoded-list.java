class Solution {
    public int[] decompressRLElist(int[] nums) {
        int l = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<l;i=i+2)
        {
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 1;j<=freq;j++)
            {
                arr.add(val);
            }
        }
        int result[] = arr.stream().mapToInt(i -> i).toArray();
        return result;
    }
}