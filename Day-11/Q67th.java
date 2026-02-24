// Sum of Root To Leaf Binary Numbers

class Q67th {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int current){
        if(root == null) return 0;

        current = current << 1 | root.val;

        if(root.left == null && root.right == null) return current;

        return dfs(root.left, current) + dfs(root.right, current);
    }
}

// Input: root = [1,0,1,0,1,0,1]
// Output: 22
// Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
