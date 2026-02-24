// Binary Gap

class Q65th {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxGap = 0;
        int lastIndex = -1;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {

                if (lastIndex != -1) {
                    int gap = i - lastIndex;
                    maxGap = Math.max(maxGap, gap);
                }

                lastIndex = i;
            }
        }
        return maxGap;
    }
}

// Input: n = 22
// Output: 2
// Explanation: 22 in binary is "10110".
// The first adjacent pair of 1's is index [0 - 2] with a distance of 2.
// The second adjacent pair of 1's is index [2 - 3] with a distance of 1.
// The answer is the largest of these two distances, which is 2.
// Note that [0 - 3] is not a valid pair since there is a 1 separating the two 1's underlined.
