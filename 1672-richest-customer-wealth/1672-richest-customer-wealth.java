class Solution {
    public int maximumWealth(int[][] accounts) {
        int x = accounts.length;
        int max = 0;
        for(int i=0; i<x; i++) {
            int y = accounts[i].length;
            int count =0;
            for(int z=0; z<y; z++){
                count = count+accounts[i][z];
            }
            if(max < count){
                max = count;
            }
        } 
        return max;
    }
}