import utils.TreeNode;

public class LC0101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }
    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if ((left == null && right != null) || (right == null && left != null))
            return false;
        if (left == null)
            return true;
        return (left.val == right.val)
                && isSymmetric(left.left, right.right)
                && isSymmetric(left.right, right.left);
    }
}
