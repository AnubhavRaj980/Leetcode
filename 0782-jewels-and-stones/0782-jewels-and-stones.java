class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char ch[] = jewels.toCharArray();
        int count = 0;
        for(int i = 0;i<stones.length();i++)
        {
            char ct = stones.charAt(i);
            for(char c : ch )
            {
                if(c == ct)
                count++;
            }
        }
        return count;
    }
}