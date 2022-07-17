class Solution {
    public int[] buildArray(int[] nums) {
        IntStream intStream = Arrays.stream(nums);
        int [] intArray = intStream
            .map((o)->{
                return nums[o];
            })
            .toArray();     
        return intArray;
    }
}