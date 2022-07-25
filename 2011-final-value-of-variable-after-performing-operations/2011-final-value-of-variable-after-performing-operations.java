class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i=0; i< operations.length; i++){
            String op = operations[i];
            if(op.indexOf('+') > -1){
                count= count+1;
            }else if(op.indexOf('-') > -1){
                count = count-1;
            }
        }
        return count;
    }
}