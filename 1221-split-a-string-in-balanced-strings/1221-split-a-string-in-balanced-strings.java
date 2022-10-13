class Solution {
    public int balancedStringSplit(String s) {
        
        int sum = 0;
        int result = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'L') {
             sum = sum +1;   
            } else {
             sum = sum -1;
            }
            if(sum == 0) {
                result = result +1;
            }
        }
        return result;
    }
}