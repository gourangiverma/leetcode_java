import utils.TreeNode;

public class LC0105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        if (preorder.length == 1) return new TreeNode(preorder[0]);
        return buildTree(preorder, 0, inorder, 0, inorder.length-1);
    }
    public TreeNode buildTree(int[] preorder, int start, int[] inorder, int x, int y) {
        if (x == y) return new TreeNode(inorder[x]);
        TreeNode root = new TreeNode(preorder[start]);
        int i;
        for (i = x; i <= y; i++)
            if (inorder[i] == preorder[start]) break;
        if(x <= i - 1 && i - 1 < inorder.length) {
            root.left = buildTree(preorder, start+1, inorder, x, i-1);
        }
        if(i+1 <= y && y < inorder.length && i+1 >= 0) {
            int leftTreeSize = i-x;
            root.right = buildTree(preorder, start + leftTreeSize + 1, inorder, i + 1, y);
        }
        return root;
    }
}
