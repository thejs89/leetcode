class Solution {
    public String sortSentence(String s) {
        String [] arrayS = s.split(" ");
        String result = "";
        
        Map<Integer,String> map = new HashMap<Integer,String>();
        
        for(int i = 0; i < arrayS.length; i++) {
            int key = (int) arrayS[i].charAt(arrayS[i].length()-1)-'0';
            String value = arrayS[i].substring(0, arrayS[i].length()-1);
            map.put(key,value);
        }
        
        for(int i = 1; i <= map.size(); i++) {
            result = result + map.get(i);
            if(i != map.size()) result = result + " ";
        }
            
        return result;
        
    }
}