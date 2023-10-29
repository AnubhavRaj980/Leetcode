class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int len = nums.length - 1;
        int sum = 0;
       Arrays.sort(nums);
       for(int i = 0; i<=len; i++){
           sum+=nums[i];
           nums[i] = sum;
       }
       for(int i = 0; i<queries.length; i++){
           int x = queries[i];
//Binary Search Starts
            int left = 0; int right = len; int mid = 0;
            if(x<nums[left]){
                queries[i] = left;
                continue;
            }
             if(x>nums[right]){
               queries[i] = right+1;
                continue;
            }
            while(left<=right){
                mid = left+(right-left)/2;
                if(nums[mid]==x)break;
                if(nums[mid]<x&&nums[mid+1]>x)break;
                if(nums[mid]<x)left = mid+1;
                if(nums[mid]>x)right = mid-1;
            }
            queries[i] = mid+1;
//Binary Search ends.
       }
       return queries;
    }
}