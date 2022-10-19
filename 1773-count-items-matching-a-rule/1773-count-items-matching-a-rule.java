class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int result = 0;
        
        for(int i = 0; i < items.size(); i++) {
            if("type".equals(ruleKey) && ruleValue.equals(items.get(i).get(0))) result++; 
            else if("color".equals(ruleKey) && ruleValue.equals(items.get(i).get(1))) result++;
            else if("name".equals(ruleKey) && ruleValue.equals(items.get(i).get(2))) result++;
        }
        
        return result;
        
    }
}