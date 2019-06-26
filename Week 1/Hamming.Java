class Solution {
    public int hammingDistance(int x, int y) {
        int xorResult = (int) x^y;
        String binaryStream = Integer.toBinaryString(xorResult);
        int result = 0;
        for(int i = 0; i < binaryStream.length();i++){
            if(binaryStream.charAt(i)=='1'){
                result++;
            }
        }
        return result;
    }
}