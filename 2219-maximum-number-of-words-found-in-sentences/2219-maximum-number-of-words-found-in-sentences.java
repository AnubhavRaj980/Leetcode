class Solution {
    public int words(String s)
    {
        String arr[] = s.split("\s+");
        int l = arr.length;
        return l;
    }
    public int mostWordsFound(String[] sentences) {
        int length = sentences.length;
        int max= 0;
        for(int i = 0;i<length;i++)
        {
            int got = words(sentences[i]);
            if(got>max)
            max = got;
        }
        return max;
    }
}