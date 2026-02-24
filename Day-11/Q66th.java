// Check If a String Contains All Binary Codes of Size K.

import java.util.*;

class Q66th{
    public static boolean hasAllCodes(String s, int k) {
        HashSet<String> st = new HashSet<>();

        for (int i = 0; i + k <= s.length(); i++) {
            st.add(s.substring(i, i + k));
        }

        return st.size() == (int)Math.pow(2, k);
    }

    public static void main(String[] args){
        System.out.println(hasAllCodes("00110110", 2));
    }
}

// Input: s = "00110110", k = 2
// Output: true
// Explanation: The binary codes of length 2 are "00", "01", "10" and "11". They can be all found as substrings at indices 0, 1, 3 and 2 respectively.
