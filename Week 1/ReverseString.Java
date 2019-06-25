class Solution {
    public void reverseString(char[] s) {
        int upperBound = s.length/2;
        if(s.length % 2 == 1){
            upperBound = (s.length/2)+1;
        }
        
         for(int j = 0; j < upperBound; j++){
                char temp = s[j];
                s[j] = s[s.length-j-1];
                s[s.length-j-1] = temp;
            }
    }
}