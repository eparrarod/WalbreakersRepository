class Solution {
    public int findComplement(int num) {
        int result = 0;
        String binaryStream = Integer.toBinaryString(num);
        for(int i=0; i < binaryStream.length(); i++){
            StringBuilder tempString = new StringBuilder(binaryStream);
            int temp = 1;
            if(binaryStream.charAt(i)=='1'){
                temp = 0;
            }
            result += Math.pow(2,binaryStream.length()-i-1)*temp;
        }
        return result;
    }
}