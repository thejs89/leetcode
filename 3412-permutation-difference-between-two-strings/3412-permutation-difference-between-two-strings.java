class Solution {
    public int findPermutationDifference(String s, String t) {
        char [] charS = s.toCharArray();
        char [] charT = t.toCharArray();
        int result = 0;
        for(int i=0; i < s.length(); i++ ) {
            for(int j=0; j < t.length(); j++) {
                if(charS[i] == charT[j]){
                    result = result + Math.abs(i-j);
                }
            }
        }
        return result;
    }   
}