class Solution {
    public String truncateSentence(String s, int k) {
        /*
        String [] arrS = s.split(" ");
        String [] arrScut = Arrays.copyOfRange(arrS, 0, k); 
        String result = String.join(" ",arrScut); 
        return result;
        */
        int wordCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                wordCount++;
                if(wordCount == k) {
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}