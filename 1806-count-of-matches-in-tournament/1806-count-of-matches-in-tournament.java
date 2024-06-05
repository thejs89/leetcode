class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        int matches = 0;
        while (n >= 2) {
            matches = n / 2;
            // 나머지가 있으면
            if(n%2 != 0) { 
                n = (n-1) /2 + 1;
            } else {
                n = n/2;
            }
            result = result + matches;
        }
        return result; 
    }
}