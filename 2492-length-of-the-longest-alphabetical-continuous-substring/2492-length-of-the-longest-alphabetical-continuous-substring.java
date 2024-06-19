class Solution {
    public int longestContinuousSubstring(String s) {
        
        int current = 1;
        int longest = 1;

        for(int i=0; i < s.length()-1; i++) {
            if(s.charAt(i)-s.charAt(i+1) == -1) {
                current++;
                longest = Math.max(longest,current);
            }else {
                current = 1;
            }
        }

        return longest;

    }
}