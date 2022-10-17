class Solution {
    public String decodeMessage(String key, String message) {
        
        Map<Character,Character> map = new HashMap<Character,Character>();
        char a = 'a';
        
        for(char c: key.toCharArray()) {
            
            if(c != ' ' && !map.containsKey(c)) {
                map.put(c,a);
                a++;
            }
            
        }
        
        String result = "";
        
        for(char c: message.toCharArray()) {
            if(c != ' ') {
                result = result + Character.toString(map.get(c));   
            }else {
                result = result + " ";
            }
        }
        
        
        return result;
        
    }
}