class Solution {
    public String reversePrefix(String word, char ch) {

        char [] charWord = word.toCharArray();        
        int index = word.indexOf(ch);

        if(index == -1) return word;
        
        char [] charArr = new char [word.length()];
        for(int i = 0; i <= index; i++) {
            charArr[i] = charWord[index-i];
        }

        for(int i= index+1; i < word.length(); i++) {
            charArr[i] = charWord[i];
        }
          String result = new String(charArr);
          return result;
    }
}