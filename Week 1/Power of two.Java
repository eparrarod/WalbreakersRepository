class Solution {
    public boolean isPowerOfTwo(int n) {
        int base = 0;
        boolean result = false;
        do{
            if(n == (int) Math.pow(2,base)){
                result = true;
                break;
            }
            base++;
        }while(Math.pow(2,base)<=n);
        
    return result;
    }
}