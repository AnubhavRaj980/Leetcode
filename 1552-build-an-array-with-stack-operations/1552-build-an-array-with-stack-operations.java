class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> str = new ArrayList<>();
        int l = target.length;
        int current = 1;
        for(int i = 0;i<l;i++)
        {
            while(current <target[i])
            {
                str.add("Push");
                str.add("Pop");
                current++;
            }
            str.add("Push");
            current++;
        }

        return str;
    }
}