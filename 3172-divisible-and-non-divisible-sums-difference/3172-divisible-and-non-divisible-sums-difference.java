class Solution {
    public int differenceOfSums(int n, int m) {


        int dis = 0;
        int notdis = 0;


        for(int i=1; i <= n; i++) {

            if(i%m == 0) dis = dis + i;
            else notdis = notdis + i;            

        }

        return notdis - dis;
        
    }
}