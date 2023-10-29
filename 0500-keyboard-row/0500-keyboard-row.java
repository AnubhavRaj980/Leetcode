class Solution {
    public String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        List<String> list = new LinkedList<>();
        for(int i=0;i<words.length;i++){
            if(check(words[i],one) || check(words[i],two) || check(words[i],three)){
                list.add(words[i]);
            }
        }
        String[] arr = new String[list.size()];
 
        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        
        return arr;
    }
    public boolean check(String s,String checker){
        boolean temp = true;
        for(char c : s.toCharArray()){
            boolean isTrue = false;
            for(char ch : checker.toCharArray()){
                if(c == ch){
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue){
                return false;
            }
        }
        return temp;

    }
}