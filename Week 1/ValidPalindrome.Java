class Solution {
    public boolean isPalindrome(String s) {
        boolean result = true;
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int upperBound = s.length()/2;
        if(s.length() % 2 == 1){
            upperBound = (s.length()/2)+1;
        }
        
         for(int j = 0; j < upperBound; j++){
                if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(s.length()-j-1))){
                    result = false;
                }
            }
        
    return result;
    }
}