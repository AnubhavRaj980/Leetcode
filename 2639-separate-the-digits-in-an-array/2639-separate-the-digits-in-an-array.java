class Solution {
    public int[] separateDigits(int[] nums) {
        int len = 0;
        for (int num : nums) {
            while (num > 0) {
                num /= 10;
                ++len;
            }
        }

        int[] res = new int[len];
        int index = len-1;

        for (int i = nums.length-1; i >= 0; i--) {
            int num = nums[i];
            while (num > 0) {
                res[index--] = num%10;
                num /= 10;
            }
        }

        return res;
    }
}