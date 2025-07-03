import utils.TreeNode;

public class LC0236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        if(root.left == null && root.right == null)
            return (root == p || root == q) ? root : null;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (root == p) {
            if (left == q || right == q) return root;
            else return p;
        } else if (root == q) {
            if (left == p || right == p) return root;
            else return q;
        }

        if ((left == p && right == q) || (right == p && left == q)) return root;
        else if (left == null) return right;
        else return left;
    }
}
