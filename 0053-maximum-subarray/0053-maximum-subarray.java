// class Solution {
//     public int maxSubArray(int[] nums) {
//         int l = nums.length;
//         int start = 0;
//         int end = l-1;
//         int sum =0;
//         int max = 0;
//         while(start<end)
//         {
//             sum =0;
//             for(int i = start;i<=end;i++)
//             {
//                 sum += nums[i];
//             }
//             max = Math.max(max,sum);
//         }
//         return max;
//     }
// }
class Solution
{
static int maxSubArray(int nums[])
    {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++) {
            max_ending_here += nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}