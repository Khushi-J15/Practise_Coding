// Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.

class Q73th {
    public String findDifferentBinaryString(String[] nums) {
        char[] res = new char[nums.length];

        for (int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
            res[i] = (c == '0') ? '1' : '0';
        }

        return new String(res);
    }
}

// Input: nums = ["01","10"]
// Output: "11"
// Explanation: "11" does not appear in nums. "00" would also be correct.
