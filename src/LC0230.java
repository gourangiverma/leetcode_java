import utils.TreeNode;

public class LC0230 {
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        return inorderCounter(root, k).val;
    }
    private TreeNode inorderCounter(TreeNode root, int k) {
        if (root == null) return null;

        TreeNode left = inorderCounter(root.left, k);
        if (left != null) return left;

        count++;
        if (count == k) return root;

        return inorderCounter(root.right, k);
    }
}
