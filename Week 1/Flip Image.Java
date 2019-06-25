class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int upperBound = A[0].length/2;
        if(A[0].length % 2 == 1){
            upperBound = (A[0].length/2)+1;
        }
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < upperBound; j++){
                int temp = A[i][j];
                A[i][j] = reverse(A[i][A[0].length-j-1]);
                A[i][A[0].length-j-1] = reverse(temp);
            }
        }
        
        return A;
    }
    
    public int reverse (int original){
        int result = -1;
        if(original == 0){
            result = 1;
        }
        if(original == 1){
            result = 0;
        }
        return result;
    }
}