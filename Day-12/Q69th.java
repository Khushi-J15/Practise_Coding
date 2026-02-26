// Number of Steps to Reduce a Number in Binary Representation to One.

class Q69th {
    public int numSteps(String s) {
        int carry = 0;
        int ans = 0;
        int n = s.length();
        
        for(int i=n-1; i>=1; i--){
            if((s.charAt(i) + carry)%2 == 1){ // odd => add one + right shift
                ans += 2;
                carry = 1;
            }
            else{ // even => only right shift
                ans += 1;
            }
        }
        
        return ans + carry;
    }
}

// Input: s = "1101"
// Output: 6
// Explanation: "1101" corressponds to number 13 in their decimal representation.
// Step 1) 13 is odd, add 1 and obtain 14. 
// Step 2) 14 is even, divide by 2 and obtain 7.
// Step 3) 7 is odd, add 1 and obtain 8.
// Step 4) 8 is even, divide by 2 and obtain 4.  
// Step 5) 4 is even, divide by 2 and obtain 2. 
// Step 6) 2 is even, divide by 2 and obtain 1. 
