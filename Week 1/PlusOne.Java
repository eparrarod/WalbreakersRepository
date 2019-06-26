class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length-1]+=1;
        for(int i = digits.length-1 ; i > 0;i--){
            if(digits[i]>=10){
                digits[i-1]+=1;
                digits[i]=digits[i]%10;
            }
        }
        if(digits[0] >= 10){
            
            int[] digits2 = new int[digits.length+1];
            for(int i = digits.length-1 ; i > 0;i--){
                digits2[i+1] = digits[i];
            }
            digits2[1] += digits[0]%10;
            digits2[0] = digits[0]/10;
            digits = digits2;
        }
        return digits;
    }
}