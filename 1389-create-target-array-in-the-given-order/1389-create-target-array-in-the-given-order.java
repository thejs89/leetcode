class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        List<Integer> list = new ArrayList<>();
        int [] result = new int[nums.length];
        
        for(int i=0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        for(int j=0; j < list.size(); j++){
            result[j]=list.get(j);
        }
        return result;
    }
}