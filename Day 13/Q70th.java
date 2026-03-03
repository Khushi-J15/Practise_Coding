// Partitioning Into Minimum Number Of Deci-Binary Numbers.
// Answer will be Largest Number in String.
class Q70th {
    public int minPartitions(String n) {
        for (char ch = '9'; ch >= '0'; ch--) {
            if (n.indexOf(ch) != -1) {
                return ch - '0';
            }
        }

        return -1;
    }
}

// Input: n = "32"
// Output: 3
// Explanation: 10 + 11 + 11 = 32

// Input: n = "82734"
// Output: 8

// Input: n = "27346209830709182346"
// Output: 9
