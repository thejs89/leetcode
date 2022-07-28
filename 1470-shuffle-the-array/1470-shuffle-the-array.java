class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] resultArr = new int[nums.length];
        
        for(int i=0; i<n; i++){
            resultArr[i*2] = nums[i];
            resultArr[i*2+1] = nums[i+n];
            
        }
        
        return resultArr;
    }
}