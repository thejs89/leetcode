class Solution {
    public int mostWordsFound(String[] sentences) {    
        int maxLen =0;
        for(int i=0; i<sentences.length; i++){
            if(maxLen < sentences[i].split(" ").length){
                maxLen = sentences[i].split(" ").length;
            }
        }
        return maxLen;
    }
}