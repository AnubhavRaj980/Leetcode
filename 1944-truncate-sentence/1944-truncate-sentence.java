class Solution {
    public String truncateSentence(String s, int k) {
        s=s+" ";
        int l = s.length();
        int in = 0;
        String result = "";
        int a = 0;
        for(int i = 0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch == ' ')
            {
                in++;
                result += s.substring(a,i);
                a = i;
            }
            if(in == k)
            {
               return result;
            }
        }
        return result;
    }
}