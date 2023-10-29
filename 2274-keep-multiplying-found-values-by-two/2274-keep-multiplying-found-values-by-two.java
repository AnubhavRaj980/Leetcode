class Solution {
    public int findFinalValue(int[] nums, int original) {
        while (true) {
            // if the orginal*2 is found we continue to double it
            if (find(nums, original)) 
                original = original * 2;
            else 
                return original;
        }
    }

    boolean find(int[] arr, int original) {
        for (int i = 0; i < arr.length; i++) {
            // we look for original*2 in the array 
            if (arr[i] == original) {
                return true;
            }
        }

        return false;
    }
}