class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList();
        for(int i =1; i <= n; i++){
            String currentResult = "";
            if(i%3==0){
                currentResult+="Fizz";
            }
            if(i%5==0){
                currentResult+="Buzz";
            }
            if((i%3!=0)&&(i%5!=0)){
                currentResult+=String.valueOf(i);
            }
            result.add(currentResult);
        }
        return result;
    }
}