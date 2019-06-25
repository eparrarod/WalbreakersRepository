class Solution {
    public int titleToNumber(String s) {
        int columnNumber = 0;
        int asciiforA = (int) 'A';
        char c = s.charAt(s.length()-1);
        columnNumber += ((int) c) - asciiforA + 1;
        for(int i = 0; i < s.length()-1; i++){
            c = s.charAt(i);
            int letterValue = ((int) c) - asciiforA + 1;
            columnNumber += (Math.pow(26,(s.length()-1-i)))*(letterValue);
        }
        return columnNumber;
    }
}