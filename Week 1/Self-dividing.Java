class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        LinkedList<Integer> selfDividing =  new LinkedList<Integer>();
        
        for(int i = left; i<= right; i++){
            if(isSelfDividing(i)){
               selfDividing.add(i);
            }
        }
       return selfDividing;
    }
    
    public boolean isSelfDividing(int i){
            int t = i;
            boolean result = true;

            while(t>=10){
                int digit = t%10;
                if(digit ==0 || i % digit != 0){
                    result = false;
                    break;
                }
                t = t/10;
            }
            if(t ==0 || i % t != 0){
                    result = false;
                }

        return result;
    }   
}