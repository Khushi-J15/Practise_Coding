// Minimum Operations to Make a Uni-Value Grid
// You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.

// A uni-value grid is a grid where all the elements of it are equal.

// Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.

class Q81th {
    public int minOperations(int[][] grid, int x) {
        List<Integer> res = new ArrayList<>();
        for (int[] row : grid) {
            for (int v : row) 
                res.add(v);
        }

        int mod = res.get(0) % x;
        for (int v : res) {
            if (v % x != mod) 
                return -1; // not divisible by x
        }

        Collections.sort(res);
        int m = res.get(res.size() / 2);
        int cnt = 0;
        for (int v : res) {
            cnt += Math.abs(v - m) / x;
        }
        return cnt;
    }
}
