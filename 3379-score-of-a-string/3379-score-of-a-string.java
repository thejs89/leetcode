class Solution {
    public int scoreOfString(String s) {
        String [] sArr = s.split("");
        int [] intArr = new int[sArr.length];

        for(int i=0; i < sArr.length; i++) {
            int item = sArr[i].charAt(0);
            intArr[i] = item;
        }

        int result = 0;
        for(int i=0; i < intArr.length-1; i++) {
            int absVaule = Math.abs(intArr[i] - intArr[i+1]);
            result = result + absVaule;
        }
        return result; 
    }
}