class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        // Step 1: Find the first element (from right to left) that is smaller than its next element
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        // Step 2: If such an element is found, find the smallest element to the right of i that is greater than nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (j > i && nums[j] <= nums[i]) {
                j--;
            }
            // Step 3: Swap nums[i] and nums[j]
            swap(nums, i, j);
        }
        
        // Step 4: Reverse the elements to the right of i
        reverse(nums, i + 1, n - 1);
    }
    
    // Utility function to swap two elements in an array
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    // Utility function to reverse the elements in an array between indices start and end
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
