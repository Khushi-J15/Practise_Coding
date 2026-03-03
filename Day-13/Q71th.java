// 1545 Find Kth Bit in Nth Binary String
// Note : middle element always = 1

// S1 = "0"
// Si = Si - 1 + "1" + reverse(invert(Si - 1)) for i > 1

class Q71th {
    public char findKthBit(int n, int k) {
         if(n==1) return '0';
        
        int len = 1 << n;
        
        if(k < len/2){
            return findKthBit(n-1,k);
        }
        
        else if(k == len/2) return '1';
        
        else{
            char c = findKthBit(n-1, len-k);
            return (c == '0') ? '1' : '0';
        }
    }
}

// Input: n = 3, k = 1
// Output: "0"
// Explanation: S3 is "0111001".
// The 1st bit is "0".

// Input: n = 4, k = 11
// Output: "1"
// Explanation: S4 is "011100110110001".
// The 11th bit is "1".
