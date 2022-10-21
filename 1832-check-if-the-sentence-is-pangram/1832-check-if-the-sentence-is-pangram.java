class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int [] result = new int[26];
        
        for(int i=0; i < sentence.length(); i++) {
            result[sentence.charAt(i)-'a'] = result[sentence.charAt(i)-'a'] +1;
        }
        
        for(int i=0; i < result.length; i++) {
            if(result[i] < 1) return false;
        }
        return true;
    }
}