class Solution {
    public int pivotInteger(int n) {
        
        int sum = 0;
        int nsum =0;

        for(int i=1; i<=n; i++) {
            sum = sum + i;
            for(int j=i; j<=n; j++) {
                nsum = nsum + j;
             }
             if(sum == nsum) return i; 
             nsum =0;    
        }


        return -1;
        
    }
}