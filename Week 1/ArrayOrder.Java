class Solution {
    public int[] sortArrayByParity(int[] A) {
        int size  = A.length;
        for (int i = 0 ; i < size; i++){
            int a = A[i];
            if(a % 2 == 0){
                continue;
            }else{
                for (int j = i ; j < size; j++){
                    if(A[j] % 2 == 0){
                        int c = a;
                        A[i] = A[j];
                        A[j] = c;
                        break;
                    }
                }
            }
        }
        return A;
    }
}