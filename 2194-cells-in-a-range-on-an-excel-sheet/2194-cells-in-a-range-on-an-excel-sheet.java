class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> list = new ArrayList<String>();
        char startRow = s.charAt(0);
        char endRow = s.charAt(3);
        
        while(startRow <= endRow) {
            int startCol = (int) (s.charAt(1) - '0');     
            int endCol = (int) (s.charAt(4) - '0');    
            
            while(startCol <= endCol) {
                list.add(startRow + Integer.toString(startCol));   
                startCol++;
            }
        
            startRow++;
        }
        return list;
    }
}