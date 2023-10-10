class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder ghj = new StringBuilder();
        for(int i =0 ;i<word1.length;i++)
        {
            str.append(word1[i]);
        }
        for(int i = 0 ;i<word2.length;i++)
        {
            ghj.append(word2[i]);
        }
        String s1  = str.toString();
        String s2 = ghj.toString();
        System.out.println(s1+" "+s2);
        if(s1.equals(s2))
        {
            return true;
        }
        return false;
    }
}