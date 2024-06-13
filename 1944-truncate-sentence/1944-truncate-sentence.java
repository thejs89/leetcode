class Solution {
    public String truncateSentence(String s, int k) {
        String [] arrS = s.split(" ");
        String [] arrScut = Arrays.copyOfRange(arrS, 0, k); 
        String result = String.join(" ",arrScut); 
        return result;
    }
}