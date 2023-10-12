class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<l;i++)
        {
            System.out.print(nums[i]);
        }
    }
}