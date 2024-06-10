class Solution {
    public int minOperations(int[] nums, int k) {

        Arrays.sort(nums);

        int result = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < k) result = result + 1;
        }
        
        return result;
    }
}