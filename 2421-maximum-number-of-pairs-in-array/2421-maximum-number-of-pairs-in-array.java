class Solution {
    public int[] numberOfPairs(int[] nums) {
        int numberOfPairs = 0;
        int leftOverInteger = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);

        for(int num : map.values()) {
            numberOfPairs += (num / 2);
            if(num % 2 == 1) leftOverInteger++;
        }

        return new int[] {numberOfPairs, leftOverInteger};
    }
}