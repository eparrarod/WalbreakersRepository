class Solution {
    public boolean detectCapitalUse(String word) {
        int flag = 0;
        boolean result = true;
        if(Character.isUpperCase(word.charAt(0))){
            flag = 0;
        }else{
            flag = 1;
        }
        for(int i = 1 ; i < word.length() ; i++){
            if(Character.isLowerCase(word.charAt(i))){
                if(i > 1 && flag == 0){
                    result = false;
                    break;
                }else{
                    flag = 1;
                }
            }else{
                if(flag == 1){
                    result = false;
                   break; 
                }
            }
        }
        return result;
    }
}