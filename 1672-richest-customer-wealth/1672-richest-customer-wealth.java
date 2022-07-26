class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0; i<accounts.length; i++) {
            int count =0;
            for(int z=0; z<accounts[i].length; z++){
                count = count+accounts[i][z];
            }
            if(max < count){
                max = count;
            }
        } 
        return max;
    }
}