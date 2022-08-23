class Solution {
    public int subtractProductAndSum(int n) {
        
        int size = (int)(Math.log10(n)+1 );
     
        int x = 1;
        int c = 0;
        
        for(int i=0; i < size; i++ ){
            x = x * (n % 10);
            c = c + (n % 10);
            n = n/10;
        }
            
        return x-c;
        
    }
}