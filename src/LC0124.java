import utils.TreeNode;

public class LC0124 {
    int globalMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSumHelper(root);
        return globalMax;
    }
    private int maxSumHelper(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            if (root.val > globalMax) globalMax = root.val;
            return root.val;
        }
        int left = Math.max(maxSumHelper(root.left), 0);
        int right = Math.max(maxSumHelper(root.right), 0);

        int path = left + right + root.val; // max sum path through root
        if (path > globalMax) globalMax = path;

        return Math.max(left, right) + root.val;
    }
}
