class Solution {
    public int numJewelsInStones(String jewels, String stones) {
         int result = 0;
         for (int i = 0; i < jewels.length(); i++) {
            char jc = jewels.charAt(i);
            for(int j = 0; j < stones.length(); j++) {
                char js = stones.charAt(j);
                if(jc == js){
                    result = result+1;
                }
            }
         }
        return result;
    }
}