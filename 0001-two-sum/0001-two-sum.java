class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int result[] = new int[2];
       outer: for(int i =0;i<l-1;i++)
        {
            for(int j =i+1;j<l;j++)
            {

            if((nums[i]+nums[j]) == target)
            {
                result[0] = i;
                result[1] = j;
                break outer;
            }
            }
        }
        return result;
    }
}