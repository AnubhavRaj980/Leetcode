class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        // Create an ArrayList to store the split words.
        List<String> arr = new ArrayList<>();

        // Convert the separator character to a String format.
        String p = String.valueOf(separator);

        // Loop through each word in the input list.
        for (String word : words) {
            // Split the word into an array of substrings using the separator.
            String[] a = word.split("\\Q" + p + "\\E");
            
            // Loop through the array of split words.
            for (String splitWord : a) {
                // Check if the split word is not empty.
                if (!splitWord.isEmpty()) {
                    // Add the non-empty split word to the ArrayList.
                    arr.add(splitWord);
                }
            }
        }
        
        // Return the ArrayList containing all the split words.
        return arr;
    }
}