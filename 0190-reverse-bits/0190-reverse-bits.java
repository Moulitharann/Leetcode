public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        
        StringBuilder paddedBinary = new StringBuilder();
        for (int i = 0; i < 32 - binaryString.length(); i++) {
            paddedBinary.append('0');
        }
        paddedBinary.append(binaryString);
        
        String reversedBinary = paddedBinary.reverse().toString();
        
        int reversedInteger = Integer.parseUnsignedInt(reversedBinary, 2);
        
        return reversedInteger;
    }
}
