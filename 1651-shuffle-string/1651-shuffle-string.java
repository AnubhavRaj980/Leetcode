class Solution {
    public String restoreString(String s, int[] indices) {
        int l =indices.length;
        String result[] = new String[l];
        for(int i =0;i<l;i++)
        {
            int ind = indices[i];
            result[ind] = Character.toString(s.charAt(i));
        }
        String str = String.join("", result);
        return str;
    }
}