// Reverse Bits

public class Q63th {
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            int lastBit = n & 1;  // take last bit

            result = result << 1; // make space

            result = result | lastBit; // add bit

            n = n >>> 1; // remove last bit
        }
        return result;
    }
}

// Original : 00000000 00000000 00000000 00000101
// Reversed : 10100000 00000000 00000000 00000000
