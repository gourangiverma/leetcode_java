import utils.TreeNode;

public class LC0129 {
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        return sumNumbers(root, 0);
    }
    private int sumNumbers(TreeNode root, int path) {
        if (root == null)
            return path;
        if (root.left == null && root.right == null)
            return path*10 + root.val;
        return sumNumbers(root.left, path*10 + root.val) + sumNumbers(root.right, path*10 + root.val);
    }
}
