class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i=0; i< operations.length; i++){
            if(operations[i].indexOf('+') > -1){
                count= count+1;
            }else if(operations[i].indexOf('-') > -1){
                count = count-1;
            }
        }
        return count;
    }
}