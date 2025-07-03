import utils.TreeNode;

public class LC0543 {
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxDiameter;
    }
    private int height(TreeNode root) {
        if (root == null) return -1;
        if (root.left == null && root.right == null) return 0;

        int left_height = height(root.left);
        int right_height = height(root.right);

        if (2 + left_height + right_height > maxDiameter)
            maxDiameter = 2 + left_height + right_height;

        return Math.max(left_height, right_height) + 1;
    }
}
