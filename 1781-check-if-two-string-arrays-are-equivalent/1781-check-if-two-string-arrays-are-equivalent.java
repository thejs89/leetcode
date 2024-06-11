class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String word1Str = String.join("",word1);
        String word2Str = String.join("",word2);

        boolean result = false;

        if(word1Str.equals(word2Str)) result = true;
        return result;
    }
}