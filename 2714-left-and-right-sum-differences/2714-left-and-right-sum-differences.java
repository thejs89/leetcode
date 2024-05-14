class Solution {
    public int[] leftRightDifference(int[] nums) {
        int len = nums.length;
        int [] leftSum = new int [len];
        leftSum[0] = 0;
        int [] rightSum = new int[len];
        rightSum[len-1] = 0;

        int [] result = new int [len]; 
        for(int i=1; i < len; i++) {
            leftSum[i] = nums[i-1] + leftSum[i-1];
        }

        for(int i = len-2; i>= 0; i--) {
            rightSum[i] = nums[i+1] + rightSum[i+1];
        }

        for(int i=0; i < len; i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
           

        return result;
    }
}