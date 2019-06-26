class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                    s = reverseSubstring(s, start, i-1);
                    start = i+1;
            }
        }
        s = reverseSubstring(s, start, s.length()-1);
        return s;
    }
    
        public String reverseSubstring(String s, int start, int end) {
        int length = end-start;
        int upperBound = (length)/2;
        if(length % 2 == 1){
            upperBound = (length/2)+1;
        }
        StringBuilder tempString = new StringBuilder(s);
         for(int j = start; j < (start+upperBound); j++){
                char temp = s.charAt(j);
                tempString.setCharAt(j, s.charAt(end-(j-start)));
                tempString.setCharAt(end-(j-start), temp);
         }
        return tempString.toString();
    }
}