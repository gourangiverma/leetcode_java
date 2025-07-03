import utils.TreeNode;

public class LC0114 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root, null);
    }
    private void flatten(TreeNode root, TreeNode rightBranch) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            root.right = rightBranch;
            return;
        }
        if (root.left != null) flatten(root.left, (root.right==null)? rightBranch : root.right);
        if (root.right != null) flatten(root.right, rightBranch);
        root.right = root.left;
        root.left = null;
    }
}
