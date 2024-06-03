class Solution {
    public int minimumSum(int num) {
        int [] nums = new int[4];
        
        int i = 0;
        while(num > 0) {
            nums[i++] = num % 10;
            num = num / 10;
        }

        Arrays.sort(nums);
        int first = 0;
        int second = 0;
        for(int j = 0; j < nums.length; j++) {
            if(j % 2 == 0) {
                first = first * 10;
                first = first + nums[j];
            } else {
                second = second * 10;
                second = second + nums[j];
            }
        }
        return first + second;
    }
}