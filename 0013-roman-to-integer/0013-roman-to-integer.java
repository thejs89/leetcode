class Solution {
    public int romanToInt(String s) {

        int n = s.length();
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int curr = valueOf(s.charAt(i));

            if (i + 1 < n && valueOf(s.charAt(i + 1)) > curr) {
                ans = ans - curr;
            } else {
                ans = ans + curr;
            }

        }

         return ans;  
    }

    private static int valueOf(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}