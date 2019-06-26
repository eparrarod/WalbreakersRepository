class Solution {
    public String reverseVowels(String s) {
     int end = s.length()-1;
        for(int i = 0; i < s.length(); i++){
            
        if(isVowel(s.charAt(i))){
            while(end > i){
                if(isVowel(s.charAt(end))){
                    StringBuilder tempString = new StringBuilder(s);
                    char temp = s.charAt(i);
                    tempString.setCharAt(i, s.charAt(end));
                    tempString.setCharAt(end, temp);
                    s = tempString.toString();
                    end--;
                    break;
                }
                end--;
            }
         }
            if(end == i ){
                break;
            }
        }
        
        return s;
        
    }
    
    public boolean isVowel(char c){
        c = Character.toLowerCase(c);
        boolean result = false;
        if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u'){
            result = true;
        }
        
        return result;
    }
}