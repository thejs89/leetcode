class Solution {
    public int[] runningSum(int[] nums) {
        int numsLen = nums.length;
        int[] result = new int[numsLen];
        
        result[0] = nums[0];
        for(int i=1; i < numsLen;  i++){
            result[i] = result[i-1] + nums[i];  
        }  
        return result;
    }
}