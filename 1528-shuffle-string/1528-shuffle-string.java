class Solution {
    public String restoreString(String s, int[] indices) {
       String[] Arrays = new String[s.length()];
       for(int i=0; i<s.length(); i++){
         Arrays[indices[i]] = s.substring(i,i+1);    
       }
       return String.join("",Arrays);
    }
}