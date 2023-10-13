class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0;
        int dsum = 0;
        int l = nums.length;
        for(int i = 0;i<l;i++)
        {
            esum += nums[i];
            int j = nums[i];
            if(j>9)
            {
            while(j>0)
            {
                dsum += j%10;
                j=j/10; 
            }
            }
            else
            {
                dsum += nums[i];
            }
        }
        System.out.println(esum+"  "+dsum);
        return Math.abs(esum - dsum);
    }
}