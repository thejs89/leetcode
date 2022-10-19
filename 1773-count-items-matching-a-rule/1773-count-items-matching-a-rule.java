class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int result = 0;
        
        int location;
        
        if("type".equals(ruleKey)) location = 0;
        else if("color".equals(ruleKey)) location = 1;
        else if("name".equals(ruleKey)) location = 2;
        else return 0;
        
        for(int i = 0; i < items.size(); i++) {
            if(ruleValue.equals(items.get(i).get(location))) result++; 
        }
        
        return result;
        
    }
}