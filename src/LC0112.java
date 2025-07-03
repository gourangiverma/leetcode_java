import utils.TreeNode;

public class LC0112 {
    public boolean hasPathSum(TreeNode root, int target) {
        if (root == null) return false;
        if (root.left == null && root.right == null)
            return root.val == target; // path completed

        boolean path1 = root.left != null && hasPathSum(root.left, target - root.val);
        boolean path2 = root.right != null && hasPathSum(root.right, target - root.val);

        return path1 || path2;
    }
}
