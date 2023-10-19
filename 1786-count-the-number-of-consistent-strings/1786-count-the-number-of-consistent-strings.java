class Solution
{
    public int countConsistentStrings(String a, String[] words)
    {
        HashSet<Character> fuck = new HashSet<>();
        int ans = 0;
        for(int i = 0;i<a.length();i++)
        {
           fuck.add(a.charAt(i));
        }
        for(int i = 0;i<words.length;i++)
        {
            int count = 0;
            for(int j  =0;j<words[i].length();j++)
            {
                if(!fuck.contains(words[i].charAt(j)))
                {
                    count++;
                }
            }
            if(count == 0)
            {
                ans++;
            }
        }
        return ans;
    }
}